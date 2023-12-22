import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];
		a[0] = sc.nextInt();

		int curentInt = a[0];
		int beforeCur = curentInt;
		for(int i = 1;i < (n - 1);i++) {
			curentInt = sc.nextInt();
			a[i] = (beforeCur > curentInt) ? curentInt :beforeCur;
			beforeCur = curentInt;
		}

		a[n - 1] = curentInt;

		long sum = java.util.Arrays.stream(a).sum();
		System.out.println(sum);
	}
}