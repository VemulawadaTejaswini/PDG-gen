import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = N/100;
		int b = (N - a*100)/10;
		if (a > b) {
			System.out.println(a*100 + a*10 + a);
		} else if(a == b) {
			int c = N -a*100 -b*10;
			if (b >= c) {
				System.out.println(a*100 + a*10 + a);
			}else {
				a ++;
				System.out.println(a*100 + a*10 + a);
			}
		} else {
			a++;
			System.out.println(a*100 + a*10 + a);
		}
	}
}
