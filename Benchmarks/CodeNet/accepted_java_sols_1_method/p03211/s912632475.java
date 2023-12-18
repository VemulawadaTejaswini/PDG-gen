import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] num = s.split("");
		int[] num3 = new int[s.length()-2];
		for(int i = 0;i < s.length() - 2;i ++) {
			num3[i] = Integer.parseInt(num[i]+num[i+1]+num[i+2]);
		}
		Arrays.sort(num3);
		int dmin = 0;
		String S = "";
		int sum = 0,d = 0;
		for(int i = s.length() - 3;i >= 0;i --) {
			d = Math.abs(num3[i] - 753);
			if(i == s.length() - 3) dmin = d;
			else {
				if(num3[i] < 753 && dmin < d) break;
				if(dmin > d) dmin = d;
			}
		}
		System.out.println(dmin);
	}
}