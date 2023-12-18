import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
long x;
		if (a == 1) {
			if (b >= 2) {
				b = b - 2;
				System.out.println(b);
			} else {
				System.out.println(1);
			}
		}


		if(a==2){
			System.out.println(0);
		}


		if(a>=3){
			if(b==1){
				System.out.println(a-2);
			}
			if(b==2){
				System.out.println(0);
			}

			if(b>=3){
				x=(a-2)*(b-2);
				System.out.println(x);
			}
		}


	}
}