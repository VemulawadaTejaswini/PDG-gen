import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		
		while (line.equals("0 0 0") == false) {
			String[] nico = line.split(" ");
			
			int max = 0;
			int total = 0;
			
			int[] length  = new int[3];
			for (int i = 0; i < length.length; i++) {
				length[i] = Integer.parseInt(nico[i]);
				total = total + length[i] * length[i];
				if (max < length[i]) max = length[i];
			}
			total = total - max * max;
			
			double r = Math.sqrt(total) / 2;

			int lines = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < lines; i++) {
				int hr = Integer.parseInt(sc.nextLine());
				if (hr > r) System.out.println("OK");
				else System.out.println("NA");
			}
			
			line = sc.nextLine();
		}
	}
}