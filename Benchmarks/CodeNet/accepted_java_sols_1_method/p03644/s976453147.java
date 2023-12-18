import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		int a[] = new int[9];
		int N = sc.nextInt();
		int temp =1;
		for (int i=0;i<a.length;i++) {
			a[i] = temp;
			temp *=2;
		}
		for (int i=a.length-1;i>=0;i--) {
			if (a[i]<=N) {
				System.out.println(a[i]);
				return;
			}
		}
	}
}