import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int xx = x;

		int a_5 = 0;
		int b_5 = 0;
		int a = 0;
		int b = 0;

		for (int i = -120;i<=120 ;i++ ) {
			for (int j = 120;j>=-120 ;j-- ) {
				a = i;
				b = j;
				if (Math.pow(a,5)-Math.pow(b,5)==x) {
					System.out.println(a+" "+b);
					System.exit(0);
				}
			}

		}

	}
}
