import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int[10];
		for (int i=0;i<4;i++) {
			int temp = sc.nextInt();
			if (temp!=1&&temp!=9&&temp!=7&&temp!=4) {
				System.out.println("NO");
				return ;
			}
			A[temp]++;
			if (A[temp]>1) {
				System.out.println("NO");
				return ;
			}
		}
		System.out.println("YES");
	}
}
