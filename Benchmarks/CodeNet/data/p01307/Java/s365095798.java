import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++) {
			String s = sc.next();
			int n = s.length();
			int sum = 0;
			for(int i=0;i<n;i++) {
				sum += s.charAt(i) - '0';
			}
			int turn = n + (sum-1)/9;
			if (turn % 2 == 0) {
				System.out.println("Fabre wins.");
			}else{
				System.out.println("Audrey wins.");
			}
		}
	}

}