import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		String line2 = sc.nextLine();
		int R0 = Integer.parseInt(line2);
		
		String line3 = sc.nextLine();
		int R1 = Integer.parseInt(line3);
		
		int min = Math.min(R0, R1);
		int answer = R1 - R0;		
		
		for (int i = 2; i < n; i++) {
			String next = sc.nextLine();
			int R = Integer.parseInt(next);
			
			answer = Math.max(answer, R-min);
			min = Math.min(min, R);
		}
		
		System.out.println(answer);

	}

}