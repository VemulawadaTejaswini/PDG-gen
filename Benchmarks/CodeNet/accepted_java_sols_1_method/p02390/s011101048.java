import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int h = 0;
		int m = 0;
		int s = 0;
		while(S >= 3600) {
			S = S - 3600;
			h++;
		}
		while(S >= 60) {
			S = S - 60;
			m++;
		}
		s = S;
		System.out.println(h + ":" + m + ":" + s);
	}
}