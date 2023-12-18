import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int r=0;

		if(a<b) {
			for(int i = a;i <= b;i++) {
				if(c%i==0) {
					r++;
				}

			}
			System.out.println(r);

		}else if(a>b) {
			for(int i = b;i < a;i++) {
				if(i%c==0) {
					r++;
				}

			}
			System.out.println(r);

		}else {
			if(c==1) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}

		}




    }

}
