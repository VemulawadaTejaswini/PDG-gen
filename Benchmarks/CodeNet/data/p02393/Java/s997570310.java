
import java.util.Scanner;

public class SortingTreeNumbers {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int[] a = new int[3];

		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			for(int j = 0; j < i; j++) {
				if(a[i] < a[j]) swap(a, i, j);
			}
		}

		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]);

		System.out.println();
	}

	public static void swap(int a[], int i, int j) {
		int k = a[i];
		a[i] = a[j];
		a[j] = k;
	}

}

