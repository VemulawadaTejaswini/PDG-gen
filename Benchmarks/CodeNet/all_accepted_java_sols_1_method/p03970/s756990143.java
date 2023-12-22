import java.util.*;

public class Main {
	static char[] ORG = "CODEFESTIVAL2016".toCharArray();
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int count = 0;
		for (int i = 0; i < ORG.length; i++) {
			if (ORG[i] != arr[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
