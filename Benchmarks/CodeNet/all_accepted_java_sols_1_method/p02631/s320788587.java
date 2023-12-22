import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		int bitsum = 0;
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			bitsum ^= a[i];
		}

		System.out.print((bitsum^a[0]));
		for(int i=1; i<n; i++) {
			System.out.print(" " + (bitsum^a[i]));
		}

	}

}
