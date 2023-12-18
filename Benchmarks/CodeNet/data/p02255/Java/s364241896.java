import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0 ; i < N; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int trg = a[i];
			int j = i - 1;
			while (j >= 0 && trg < a[j]){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = trg;
			for (int k = 0; k < a.length-1; k++)
				System.out.printf("%d ", a[k]);
			System.out.println(a[a.length-1]);
		}
	}
}