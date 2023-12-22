
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.MidiChannel;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = scan.nextInt();
		}
		int q = scan.nextInt();
		int[] T = new int[q];
		for (int i = 0; i < T.length; i++) {
			T[i] = scan.nextInt();
		}
		int count = 0;
		for(int t: T){
			if (binarySearch2(S, t)) {
				count++;
			}		
		}
		
		System.out.println(count);
		scan.close();
	}

	
	public static boolean binarySearch2(int[] S, int key) {
		boolean ans = false;
		int left = 0;
		int right = S.length;
		while(left < right){
			int mid = (left + right) / 2;
			if (S[mid] == key) {
				return true;
			}else if (key < S[mid]) {
				right = mid;
			}else{
				left = mid + 1;
			}
		}
		return ans;
		
	}
}