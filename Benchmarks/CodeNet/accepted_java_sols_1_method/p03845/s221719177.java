import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		W=in.readLine();
		String[] sW = W.split(" ");
		int[] t = new int[N];
		long sum = 0;
		for(int i=0;i<N;i++){
			t[i]=Integer.parseInt(sW[i]);
			sum+=t[i];
		}

		W=in.readLine();
		int M = Integer.parseInt(W);

		int[][] p = new int[M][2];
		for(int i=0;i<M;i++){
			W=in.readLine();
			sW = W.split(" ");
			p[i][0]=Integer.parseInt(sW[0]);
			p[i][1]=Integer.parseInt(sW[1]);
		}
		for(int i=0;i<M;i++){
			System.out.println(sum - t[p[i][0]-1]+p[i][1]);
		}
	}




}
