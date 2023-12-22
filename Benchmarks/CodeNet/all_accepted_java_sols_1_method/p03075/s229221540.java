import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println((a[4]-a[0]<=k)?"Yay!":":(");
		sc.close();
	}
}