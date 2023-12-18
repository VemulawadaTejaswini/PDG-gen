
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt(),W=in.nextInt();
		
		int DP[]=new int[W+1];
		Arrays.fill(DP, 0);
		for(int i=0;i<N;i++) {
			int v=in.nextInt(),w=in.nextInt();
			for(int j=0;j<=W;j++) {
				if(j-w>=0) {
					DP[j]=Math.max(DP[j], DP[j-w]+v);
				}
			}
		}
		System.out.println(DP[W]);
	}

}

