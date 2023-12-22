

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		in.close();
		int count=1;
		int tem=7;
		int ans=-1;
		for(int i=1;i<=T;i++) {
			if(tem%T==0) {
				ans=count;
				break;
			}
			count++;
			tem=(tem*10+7)%T;
		}
		System.out.println(ans);
	}
}
