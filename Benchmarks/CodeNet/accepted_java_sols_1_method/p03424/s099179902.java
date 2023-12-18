import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S[] = new String[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
		}
		if (Arrays.asList(S).contains("Y")) {
			System.out.println("Four");
		} else {
			System.out.println("Three");
		}
	}
}