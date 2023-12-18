import java.util.Scanner;

public class Main {
	
	public static int search(int[] S, int[] T) {
		int counter = 0;
		for (int t : T) {  // iterates through each value in T
			for (int s : S) {
				if (t == s) {  // and checks against each value in S
					counter++;
					break;  // as soon as the value in T is found in S, it moves on to the next value in T
				}
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
		int result = search(S,T);
		System.out.println(result);
	}

}

