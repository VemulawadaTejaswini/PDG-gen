import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ten[] = new int[n];
		for(int i=0;i<n;i++)ten[i]=0;
		for(int s=0;s<n*(n-1)/2;s++){
			int teki=in.nextInt();
			int mika=in.nextInt();
			teki=teki-1;
			mika=mika-1;
			int t=in.nextInt();
			int m=in.nextInt();
			if(t>m)ten[teki]+=3;
			else if(t<m)ten[mika]+=3;
			else if(t==m){
				ten[teki]++;
				ten[mika]++;
			}
		}
		int rnk[] = new int[n];
		for(int s=0;s<n;s++){
			int cnt=1;
			for(int i=0;i<n;i++){
				if(ten[s]<ten[i])cnt++;
			}
			rnk[s]=cnt;
		}
		for(int i=0;i<n;i++)System.out.println(rnk[i]);
	}
}