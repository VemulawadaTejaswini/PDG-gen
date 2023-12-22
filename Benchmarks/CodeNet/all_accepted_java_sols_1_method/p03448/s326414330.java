import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A= sc.nextInt();
		int B = sc.nextInt();
		int C= sc.nextInt();
		int X= sc.nextInt();
		int count =0;
		for (int i=0;i*500<=X&&i<=A;i++) {
			int total = i*500;
			for (int j=0;j*100<=X-total&&j<=B;j++) {
				if ((X-total-j*100)/50<=C) {
					count ++;
				}
			}
		}
		System.out.println(count);
	}
}