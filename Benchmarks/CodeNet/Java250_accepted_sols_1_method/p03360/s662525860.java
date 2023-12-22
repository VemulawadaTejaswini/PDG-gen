import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int K = sc.nextInt();
		int biggestNum = 1;
		if (a >= b) {
			if (a >= c) {
				biggestNum = a;
				for (int i = 0 ; i < K ; i++) {
					biggestNum *=  2;
				}
				System.out.println(biggestNum + b + c);
			} else {
				biggestNum = c;
				for (int i = 0 ; i < K ; i++) {
					biggestNum *=  2;
				}
				System.out.println(biggestNum + a + b);
			}} else if (b >= c) {
				biggestNum = b;
				for (int i = 0 ; i < K ; i++) {
					biggestNum *=  2;
				}
				System.out.println(biggestNum + a + c);
			} else {
				biggestNum = c;
				for (int i = 0 ; i < K ; i++) {
					biggestNum *=  2;
				}
				System.out.println(biggestNum + a + b);
			}
		}
	}


