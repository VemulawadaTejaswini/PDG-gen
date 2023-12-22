import java.util.HashSet;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashSet<String> spoken = new HashSet<String>();
		String before = sc.next();
		spoken.add(before);
		boolean valid = true;
		for(int i = 0; i < N - 1; i++) {
			String W = sc.next();
			if(spoken.contains(W)) {
				valid = false;
			}
			if(before.charAt(before.length() - 1) != W.charAt(0)) {
				valid = false;
			}
			before = W;
			spoken.add(W);
		}
		System.out.println(valid ? "Yes" : "No");
	}
}
