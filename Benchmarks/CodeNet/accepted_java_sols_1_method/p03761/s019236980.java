import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		int[] num = new int[26];
		Arrays.fill(num, Integer.MAX_VALUE);
		for(int i = 0;i < N;i++) {
			int[] buf = new int[26];
			char[] str = scn.nextLine().toCharArray();
			for(int j = 0;j < str.length;j++) {
				buf[str[j]-'a']++;
			}
			for(int j = 0;j < 26;j++) {
				num[j] = Math.min(num[j], buf[j]);
			}
		}

		String ans = "";
		for(int i = 0;i < 26;i++) {
			for(int j = 0;j < num[i];j++) {
				ans += (char)('a'+i);
			}
		}
		System.out.println(ans);
	}

}
