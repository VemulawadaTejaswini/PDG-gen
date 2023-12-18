
import java.util.Scanner;

public class Main {
	static int pos=0;
	static int cnt=0;
	static int[] post,pre,in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		pre=new int[n];
		in=new int[n];
		post=new int[n];
		for(int i=0;i<n;i++)
			pre[i]=scan.nextInt();
		for(int i=0;i<n;i++)
			in[i]=scan.nextInt();
		rec(0,n);
		
		for(int i=0;i<n-1;i++){
			System.out.print(post[i]+" ");
		}
		System.out.println(post[n-1]);
	}

	private static void rec(int l, int r) {
		// TODO Auto-generated method stub
		if(l>=r)
			return;
		int c=pre[pos++];
		int m=0;
	    
	    
		while(c!=in[m]){
				m++;
		}
		rec(l, m);
		rec(m+1, r);
		post[cnt++]=c;
	}
}

