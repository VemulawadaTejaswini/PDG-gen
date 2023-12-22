import java.util.*;
public class Main {
	public static long mod;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String S[] = new String[H];
		for(int i=0;i<H;i++)S[i]=sc.next();
		sc.close();
		
		int a[][]= new int[2000][2000];
		for(int i=0;i<H;i++) {
			int cnt = 0;
			for(int j=0;j<W;j++) {
				if(S[i].charAt(j)=='.' && j!=W-1)cnt++;
				else {
					if(j==W-1&&S[i].charAt(j)=='.') {
						cnt++;
						j++;
					}
					for(int k=1;k<=cnt;k++) {
						a[i][j-k]+=cnt;
					}
					cnt=0;
				}
			}
		}

		for(int i=0;i<W;i++) {
			int cnt = 0;
			for(int j=0;j<H;j++) {
				if(S[j].charAt(i)=='.' && j!=H-1)cnt++;
				else {
					if(j==H-1&&S[j].charAt(i)=='.') {
						cnt++;
						j++;
					}
					for(int k=1;k<=cnt;k++) {
						a[j-k][i]+=cnt;
					}
					cnt=0;
				}		
			}
		}
		
		int ans=0;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				ans = Math.max(a[i][j],ans);
			}
		}
		System.out.println(ans-1);
	}
}