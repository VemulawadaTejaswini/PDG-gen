import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int f = sc.nextInt();
		int r = sc.nextInt();

		while(!(m==-1&&f==-1&&r==-1)) {
			int mf = m+f;
			if(m==-1||f==-1||mf<30) {
				System.out.println("F");
			}else if(mf >= 80) {
				System.out.println("A");
			}else if(mf >= 65) {
				System.out.println("B");
			}else if(mf >= 50) {
				System.out.println("C");
			}else if(mf >= 30 && r>=50) {
				System.out.println("C");
			}else if(mf >= 30) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}

			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();

		}




	}
}
