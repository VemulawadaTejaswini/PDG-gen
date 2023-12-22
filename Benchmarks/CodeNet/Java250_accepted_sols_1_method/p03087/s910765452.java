import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), q=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		char[] s=str.toCharArray();
		int cntAC[]=new int[n], prev=0;
		for(int i=0, cnt=0; i<n; i++) {
			if(s[i]=='A')
				prev=1;
			else if(s[i]=='C') {
				if(prev==1)
					cnt++;
				prev=0;
			}
			else
				prev=0;
			cntAC[i]=cnt;
		}
		for(int i=0; i<q; i++) {
			int l=sc.nextInt()-1, r=sc.nextInt()-1;
			System.out.println(cntAC[r]-cntAC[l]);
		}
	}
}