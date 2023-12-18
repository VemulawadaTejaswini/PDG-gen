import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] W = new String[N];

		String result = "Yes";

		for(int i = 0; i < N; i++) {
			W[i] = sc.next();
		}

		for(int i = 0; i < N-1; i++) {
			if(W[i].charAt(W[i].length() -1) != W[i+1].charAt(0)) {
				result = "No";
				break;
			}
			for(int j = i+1; j < N; j++) {
				if(W[i].equals(W[j])) {
					result = "No";
					break;
				}
			}
			if("No".contentEquals(result)) {
				break;
			}
		}

		System.out.println(result);
	}
}
