import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}

	private static void solve(){
		Scanner sc=new Scanner(System.in);

		while(true){
			List<Integer> list=new ArrayList<Integer>();
			int n=sc.nextInt();
			int r=sc.nextInt();
			if(n+r==0)break;
			for(int i=n; i>=1; i--)
				list.add(i);

			System.out.println(list.toString());

			for(int i=0; i<r; i++){
				List<Integer> stock=new ArrayList<Integer>();
				int p=sc.nextInt();
				int c=sc.nextInt();
				for(int j=c-1; j>=0; j--)
					stock.add(list.remove(p-1));
				for(int j=stock.size()-1; j>=0; j--)
					list.add(0,stock.get(j));

			}

			System.out.println(list.get(0));
		}
	}
}