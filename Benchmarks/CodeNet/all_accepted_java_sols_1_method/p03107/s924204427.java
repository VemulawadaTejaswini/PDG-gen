import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] C = sc.next().toCharArray();
		sc.close();

		int zeroCnt = 0;
		int oneCnt = 0;

		for (int i = 0; i < C.length; i++) {
			if (C[i] == '0') {
				zeroCnt++;
			} else {
				oneCnt++;
			}
		}

		System.out.println(Math.min(zeroCnt, oneCnt) * 2);
	}
}
