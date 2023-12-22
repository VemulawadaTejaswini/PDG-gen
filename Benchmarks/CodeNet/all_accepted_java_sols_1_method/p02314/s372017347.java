import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.next()),m=Integer.parseInt(in.next());
		List<Integer> coins=new ArrayList<>();
		
		for(int i=0;i<m;i++){
			coins.add(Integer.parseInt(in.next()));
		}
		
		int DP[]=new int[n+1],INF=2000000000;
		for(int i=1;i<=n;i++)DP[i]=INF;
		
		for(int i=0;i<m;i++){
			int c=coins.get(i);
			for(int j=0;j+c<=n;j++){
				DP[j+c]=Math.min(DP[j]+1, DP[j+c]);
			}
		}
		
		System.out.println(DP[n]);
		
	}

}

