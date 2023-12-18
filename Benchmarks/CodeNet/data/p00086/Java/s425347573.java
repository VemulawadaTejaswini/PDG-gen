import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			int[] points = new int[102];
			
			while (sc.hasNextLine()) {
				String[] nico = sc.nextLine().split(" ");
				int p0 = Integer.parseInt(nico[0]);
				int p1 = Integer.parseInt(nico[1]);
				if ((p0 == 0) && (p1 == 0)) break;
				
				points[p0]++;
				points[p1]++;
			}
			
			String ans = "OK";
			for (int i = 3; i < points.length; i++) {
				if (points[i] % 2 != 0) {
					ans = "NG";
					break;
				}
			}
			System.out.println(ans);
		}
	}
}