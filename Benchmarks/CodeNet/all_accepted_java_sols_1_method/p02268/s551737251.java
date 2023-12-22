import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt(),T[]=new int[n];
		
		for(int i=0;i<n;i++)T[i]=Integer.parseInt(cin.next());
		
		int q=cin.nextInt(),res=0;
		for(int i=0;i<q;i++) {
			int t=Integer.parseInt(cin.next()),s=0,m=(T.length-1)/2,g=T.length;
			while(g-s>=1) {
				if(T[m]==t) {
					res++;
					break;
				}
				if(T[m]>t) {
					g=m;
					m=(s+g)/2;
				}
				else if(T[m]<t) {
					s=m+1;
					m=(s+g)/2;
				}
			}
		}
		System.out.println(res);
	}

}

