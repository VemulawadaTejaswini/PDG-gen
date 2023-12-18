import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0189().doIt();
	}
	
	class AOJ0189{
		void doIt(){
			while(true){
				int n = in.nextInt();
				if(n==0)break;
				int d[][] = new int[10][10];
				for(int i=0;i<10;i++)Arrays.fill(d[i],Integer.MAX_VALUE/2);
				for(int i=0;i<n;i++){
					int a = in.nextInt();
					int b = in.nextInt();
					d[a][b] = d[b][a] = in.nextInt();
				}
				for(int k=0;k<10;k++)for(int i=0;i<10;i++)for(int j=0;j<10;j++){
					d[i][j] = Math.min(d[i][j],d[i][k]+d[k][j]);
				}
				int cnt[] = new int[10];
				
//				for(int i=0;i<10;i++){
//					for(int s=0;s<10;s++)System.out.print(d[i][s]+" ");
//					System.out.println();
//				}
				
				for(int i=0;i<10;i++)for(int s=0;s<10;s++)if(d[i][s]<Integer.MAX_VALUE/2&&i!=s){
					cnt[i]+=d[i][s];
				}
				int result = Integer.MAX_VALUE;
				int num = 0; 
				for(int i=0;i<10;i++)if(cnt[i]>0&&result>cnt[i]){
					result = Math.min(result, cnt[i]);
					num = i;
				}
				System.out.println(num+" "+result);
			}
		}
	}
}