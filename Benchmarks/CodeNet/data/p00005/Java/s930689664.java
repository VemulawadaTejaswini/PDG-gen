import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int[] a = new int[50];
		int[] b = new int[50];
		int[] newA = new int[50];
		int[] newB = new int[50];
		int[] gcd = new int[50];
		int[] lcm = new int[50];
		int num = 0;
		System.out.println("How Many Data set? > ");
		num = stdin.nextInt();
		for(int cnt = 0; cnt < num; cnt++) {
			System.out.print("a[cnt][" + cnt + "] = ");
			a[cnt] = stdin.nextInt();
			System.out.print("b[cnt][" + cnt + "] = ");
			b[cnt] = stdin.nextInt();
			newA[cnt] = a[cnt];
			newB[cnt] = b[cnt];
		}
		for(int cnt = 0; cnt < num; cnt++) {
			if(a[cnt] > b[cnt]) {
				int r = 0;
				while((r = a[cnt] % b[cnt]) != 0) {
					a[cnt] = b[cnt];
					b[cnt] = r;
				}
				gcd[cnt] = b[cnt];
			} else if( b[cnt] > a[cnt]) {
				int r = 0;
				while((r = b[cnt] % a[cnt]) != 0) {
					b[cnt] = a[cnt];
					a[cnt] = r;
				}
				gcd[cnt] = a[cnt];
			} else {
				gcd[cnt] = a[cnt];
				System.out.print(a[cnt]);
			}
			lcm[cnt] = (newA[cnt] * newB[cnt]) / gcd[cnt];
		}
		for(int cnt = 0; cnt < num; cnt++) {
			System.out.println("?????§??¬?´???° :" + gcd[cnt] + ", ????°???¬?????° : " + lcm[cnt] );
		}
	}
}