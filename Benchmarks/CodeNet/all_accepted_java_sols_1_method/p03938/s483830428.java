import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arrA[x - 1] = i + 1;
			arrB[x - 1] = i + 1;
		}
		for (int i = 1; i < n; i++) {
			arrA[i] += arrA[i - 1];
			arrB[n - i - 1] += arrB[n - i];
		}
		StringBuilder sbA = new StringBuilder();
		StringBuilder sbB = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sbA.append(" ");
				sbB.append(" ");
			}
			sbA.append(arrA[i]);
			sbB.append(arrB[i]);
		}
		System.out.println(sbA);
		System.out.println(sbB);
	}
}
