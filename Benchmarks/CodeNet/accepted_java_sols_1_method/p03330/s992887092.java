import java.util.*;
public class Main {

	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), C = sc.nextInt();
		int D[][] = new int[C][C];
		int c[][] = new int[N][N];
		
		for(int i=0;i<C;i++) {
			for(int j=0;j<C;j++) {
				D[i][j] = sc.nextInt();
			}
		}
		
		//ワーシャルフロイド
//		for(int k=0;k<C;k++) {
//			for(int i=0;i<C;i++) {
//				for(int j=0;j<C;j++) {
//					D[i][j]=Math.min(D[i][j], D[i][k]+D[k][j]);
//				}
//			}
//		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				c[i][j] = sc.nextInt()-1;//0index
			}
		}
		sc.close(); 
		
		int costSum0[] = new int[C]; //%3==0
		int costSum1[] = new int[C];
		int costSum2[] = new int[C];
		
		for(int color=0;color<C;color++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					int nowColor = c[i][j];
					if((i+j)%3==0) costSum0[color] += D[nowColor][color];
					if((i+j)%3==1) costSum1[color] += D[nowColor][color];
					if((i+j)%3==2) costSum2[color] += D[nowColor][color];
				}
			}
		}
		
		int ans = Integer.MAX_VALUE/2;
		//余り１のところ全通り
		for(int i=0;i<C;i++) {
			for(int j=0;j<C;j++) {
				for(int k=0;k<C;k++) {
					if(i==j||j==k||k==i)continue;
					int sum = costSum0[i]+costSum1[j]+costSum2[k];
					ans = Math.min(ans,sum);
				}
			}
		}
		System.out.println(ans);
	}
}