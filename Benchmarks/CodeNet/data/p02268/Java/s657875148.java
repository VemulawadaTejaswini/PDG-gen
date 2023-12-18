

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] S = new int[n];
		for (int i = 0; i < S.length; i++) {
			S[i] = scan.nextInt();
		}
		int q = scan.nextInt();
		int[] T = new int[q];
		for (int i = 0; i < T.length; i++) {
			T[i] = scan.nextInt();
		}
		int count = 0;
		for(int t: T){
			if (binarySearch(S, t)) {
				count++;
			}
		}
		
		System.out.println(count);
		scan.close();
	}

	public static boolean binarySearch(int[] S, int key) {
		boolean ans = false;
		int mediam = S[S.length / 2];
		if (key == mediam) {
			return true;
		}else if (key > mediam) {
			binarySearch(Arrays.copyOfRange(S, mediam, S.length - 1), key);
		}else if (key < mediam) {
			binarySearch(Arrays.copyOfRange(S, 0, mediam), key);
		}
		return ans;
	}
}