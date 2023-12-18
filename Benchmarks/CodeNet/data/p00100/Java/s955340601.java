import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int lines = Integer.parseInt(sc.nextLine());
		while (lines != 0) {
			int max = 0;
			String id = "NA";
			for (int i = 0; i < lines; i++) {
				String line = sc.nextLine();
				String[] data = line.split(" ");

				int sales = Integer.parseInt(data[1]) * Integer.parseInt(data[2]);
				if (max < sales) {
					id = data[0];
					max = sales;
				}
			}
			
			if (max >= 1000000) System.out.println(id);
			
			lines = Integer.parseInt(sc.nextLine());
		}
	}
}