import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		int[] A = new int[N+1];
		int[] B = new int[N+1];
		Arrays.fill(B,0);

		A[0]=0;
		W = in.readLine();
		String[] Ws = W.split(" ");
		for(int i=1;i<N+1;i++){
			A[i]=Integer.parseInt(Ws[i-1]);
		}

		long num = 0;
		int tmp=0;
		for(int i=A.length-1;i>0;i--){
			tmp=0;
			for(int k = 2*i;k<B.length;k=k+i){
				tmp += B[k];
			}
			if(tmp%2 == A[i]){
				B[i]=0;
			}else{
				B[i]=1;
				num++;
			}
		}

		System.out.println(num);
		for(int i=1;i<N+1;i++){
			if(B[i]==1){
				System.out.println(i);
			}
		}
	}

}
