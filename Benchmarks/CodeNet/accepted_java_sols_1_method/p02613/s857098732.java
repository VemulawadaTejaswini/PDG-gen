import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		String[] str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = scn.next();
		}
		Arrays.parallelSort(str);
		int AC = 0;
		int WA = 0;
		int TLE = 0;
		int RE = 0;
		for (int i = 0; i < N; i++) {
			String s = str[i];
			if (s.contentEquals("AC")) {
				AC++;
			} else if (s.contentEquals("WA")) {
				WA++;
			} else if (s.contentEquals("TLE")) {
				TLE++;
			} else if (s.contentEquals("RE")) {
				RE++;
			}
		}
		System.out.println("AC x " + AC);
		System.out.println("WA x " + WA);
		System.out.println("TLE x " + TLE);
		System.out.println("RE x " + RE);
	}
}