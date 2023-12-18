import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a < c && b < c) {
				if(c * c == a * a + b * b) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else if(a < b && c < b) {
				if(b * b == a * a + c * c) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				if(a * a == b * b + c * c) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
		sc.close();
	}

}