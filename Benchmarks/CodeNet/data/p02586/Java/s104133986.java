//20200815E
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		long[][] B=new long[R][C];
		long[][] M=new long[R+1][C];
		int K=sc.nextInt();
		int r;
		int c;
		for(int i =0;i<K;i++){
			r=sc.nextInt()-1;
			c=sc.nextInt()-1;
			B[r][c]=sc.nextLong();
		}
		long f;
		long s;
		long t;
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
				for(int k=j;k<C;k++){
					f=0;
					s=0;
					t=0;
					for(int l=j;l<=k;l++){
						if(f<=B[i][l]){
							t=s;
							s=f;
							f=B[i][l];
						}else if(s<=B[i][l]){
							t=s;
							s=B[i][l];
						}else if(t<=B[i][l]){
							t=B[i][l];
						}
					}
					if(M[i][j]+f+s+t>M[i+1][k]){
						M[i+1][k]=M[i][j]+f+s+t;
					}
				}
			}
		}
		System.out.println(M[R][C-1]);
	}
}