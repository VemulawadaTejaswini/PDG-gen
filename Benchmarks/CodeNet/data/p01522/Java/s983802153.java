import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N,K;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		int[][] a = new int[K][N];
		for(int i=0;i<K;i++){
			Arrays.fill(a[i], -1);
		}
		for(int i=0;i<K;i++){
			int m=sc.nextInt();
			for(int j=0;j<m;j++){
				a[i][j]=sc.nextInt();
			}
		}
		int R=sc.nextInt();int ans=0;
		int[] b = new int[N+1];
		for(int i=0;i<R;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int k=0;k<K;k++){
				for(int j=0;j<N;j++){
					for(int h=0;h<N;h++){
						if(a[k][j]==x&& a[k][h]==y || a[k][j]==y&& a[k][h]==x){
							b[a[k][j]]=b[a[k][h]]=1;
						}
					}
					
				}
			}
		}
		for(int i=0;i<N+1;i++){
			ans+=b[i];
		}
		System.out.println(ans);
		
	}

}