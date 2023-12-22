import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] A = new int[ N];
		ArrayList<Integer> a = new ArrayList<Integer>();
		boolean can = true;
		for(int i = 0;i < N;i++) {
			A[i] = scn.nextInt();
			if(A[i] > i+1)can = false;
		}

		if(can) {
			for(int i = 0;i < N;i++) {
				a.add(A[i]-1,A[i]);
			}
			for(int i = 0;i < N;i++) {
				System.out.println(a.get(i));
			}
		}else {
			System.out.println(-1);
		}
	}
}
