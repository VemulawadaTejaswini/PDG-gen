import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int[1001];
		for (int i=1;i<=40;i++) {
			for (int j=2;j<=10;j++) {
				int temp = (int) Math.pow(i, j);
				if (temp<=1000) {
					A[temp]++;
				}
			}
		}
		int X= sc.nextInt();
		for (int i=X;i>=0;i--) {
			if (A[i]>0) {
				System.out.println(i);
				return ;
			}
		}
	}
}