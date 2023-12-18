import java.util.*;

class Main {

	public static boolean search(int[] A, int n, int key) {
		A[n] = key;
		int i = 0;
		while(A[i] != key)i++;
		return i != n;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] arrayS = new int[10001];
		int[] arrayT = new int[501];
		int count = 0;
		int sNum = scan.nextInt();

		for (int i = 0; i < sNum; i++)
			arrayS[i] = scan.nextInt();

		int tNum = scan.nextInt();
		
		for (int j = 0; j < tNum; j++)
			arrayT[j] = scan.nextInt();

		
		for (int j = 0; j < tNum; j++)
			if(search(arrayS, sNum, arrayT[j])) count++;

		System.out.println(count);
	}
}