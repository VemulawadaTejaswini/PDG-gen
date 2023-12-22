import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s[]=new String[n];
		int cnt[]=new int[n];
		String scheck[]=new String[n];
		for(int i=0;i<n;i++) {
			s[i]=scan.next();
			cnt[i]=0;
			scheck[i]="";
		}
		scan.close();
		Arrays.sort(s);
		int suffix=0;
		int max=0;
		for(int i=0;i<n;i++) {
			if(i!=0&&s[i].equals(s[i-1])==false) {
				scheck[suffix]=s[i-1];
				suffix+=1;
			}if(i==n-1)scheck[suffix]=s[i];

			if(i==n-1 && s[i].equals(s[i-1])==false)scheck[suffix]=s[i];
			cnt[suffix]+=1;
			if(max<cnt[suffix])max=cnt[suffix];
		}
		for(int i=0;i<=suffix;i++) {
			if(cnt[i]==max)System.out.println(scheck[i]);
		}
	}
}