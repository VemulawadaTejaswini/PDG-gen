import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ1129().doIt();
	}
	
	class AOJ1129{
		int n,p;
		
		void solve(){
			int a[] = new int[n];
			for(int i=n-1;i>=0;i--)a[i] = n-i;
			for(int i=0;i<p;i++){
				int index = in.nextInt()-1;
				int mai = in.nextInt();
				ArrayList<Integer> list = new ArrayList<Integer>();
				for(int s=index;s<index+mai;s++)list.add(a[s]);
				for(int s=0;s<n;s++)if(s<index||mai+index<=s)list.add(a[s]);
				a = new int[n];
				for(int s=0;s<n;s++)a[s] = list.get(s);
			}
			System.out.println(a[0]);
		}
		
		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();
				p = in.nextInt();
				if(n+p==0)break;
				solve();
			}
		}
	}
	
}