import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		char[] o = sc.next().toCharArray();
		int l = o.length;
		long ans = 0L;
		for(int i = 0; i < 1<<(l-1); i++) {
			String p = Integer.toBinaryString(i);
			while(p.length() < l-1) {
				p = "0"+p;
			}
			char[] pp = p.toCharArray();
			char[] chars = new char[l*2-1];
			for(int j = 0; j < chars.length; j++) {
				if(j%2==0) chars[j]=o[j/2];
				else  {
					chars[j]=pp[(j-1)/2];
					if(chars[j]=='1') {
						chars[j]='p';
					}
				}
			}
			String[] nums = new String(chars).replaceAll("0", "").split("p");
			ans += Arrays.stream(nums).mapToLong(Long::parseLong).sum();
		}
		System.out.println(ans);
	}
}