import java.util.Scanner;

public class Main {
	
	public static Boolean search(int[] S, int t, int low, int high) {
		int mid = low + (high-low)/2;  // initializing middle value to search
		if (high < low) {
			return false;  // the algorithm has iterated through without finding t
			}
		if (S[mid] > t) {
			return search(S,t,low,mid-1);  // if t is in S, it'll be in the half of the array less than the middle value
			}
		else if (S[mid] < t) {
			return search(S,t,mid+1,high);  // if t is in S, it'll be in the half of the array greater than the middle value
			}
		else /*(S[mid] == t)*/ {  // this means mid = t, so t is in S
			return true;
			}
	}
	
	public static int contains(int[] S, int[] T) {
		int counter = 0;
		int low = 0;
		int high = S.length - 1;
		for (int t : T) {
			if (search(S, t, low, high)) {  // iterates through each value in T and searches for it in S
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sizeS = in.nextInt();
		int[] S = new int[sizeS];
		for (int i = 0; i < sizeS; i++) {
			S[i] = in.nextInt();
		}
		int sizeT = in.nextInt();
		int[] T = new int[sizeT];
		for (int i = 0; i < sizeT; i++) {
			T[i] = in.nextInt();
		}
		in.close();
		int result = contains(S,T);
		System.out.println(result);
	}

}

