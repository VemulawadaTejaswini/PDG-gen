import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int X = Integer.parseInt(W);

		int[] F = new int[100004];
		int[] L = new int[100001];
		int lIndex=0;

		Arrays.fill(F, -1);

		for(int i=2;i<F.length;i=i+2){
			if(i==4){
				i--;
			}
			if(F[i]!=-1){
				continue;
			}


			boolean flg = true;
			for(int k=0;k<lIndex;k++){
				if(i%(L[k]*1.0)==0){
					flg=false;
					break;
				}
				if(k*k>i){
					break;
				}
			}
			if(flg){
				//素数
				L[lIndex++]=i;
				F[i]=1;
				for(int k=i+i;k<F.length;k=k+i){
					F[k]=0;
				}
			}
		}
		int ans =-1;
		for(int i=X;i<F.length;i++){
			if(F[i]==1){
				ans=i;
				break;
			}
		}
		System.out.println(ans);
	}
}
