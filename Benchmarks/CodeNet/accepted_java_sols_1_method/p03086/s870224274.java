import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String S  =sc.next();
		sc.close();
		char[] ch = S.toCharArray();
		int[] cnt = new int[ch.length];
		for(int i = 0;i < ch.length;i++) {
			if(ch[i]=='A'||ch[i]=='T'||ch[i]=='G'||ch[i]=='C') {
				cnt[i]++;
			}
		}
		int[] sum = new int[ch.length+1];
		for(int i = 0;i < ch.length;i++) {
			if(cnt[i]!=0) {
				sum[i+1] = sum[i] + cnt[i];
			}else {
				sum[i+1] = 0;
			}
		}
		Arrays.sort(sum);
		System.out.println(sum[sum.length-1]);
	}
}