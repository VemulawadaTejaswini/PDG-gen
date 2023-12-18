import java.io.*;

public class Main0600{
	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String str = br.readLine();
		int N = Integer.parseInt(str);
		int[] A = new int[N];
		int m = 2000000000, M = 0;
		int kei = 0;
		int kei1 = 0, kei2 = 0, kei3 = 0;//3つの切り分けた領域の合計を表す
		int tmp;
		
		for(int i = 0; i < N; i++){
			str = br.readLine();
			A[i] = Integer.parseInt(str);
		}
		
		//主処理
		for(int n = 0; n < N; n++){
			for(int i = 1; i < N; i++){
				for(int j = i + 1; j < N + 1; j++){
						for(int i2 = 1; i2 <= i; i2++) kei1 = kei1 + A[i2 - 1];
						if(m > kei1) m = kei1;
						for(int j2 = i + 1; j2 <= j; j2++) kei2 = kei2 + A[j2 - 1];
						if(m > kei2) m = kei2;
						for(int k2 = j + 1; k2 <= N; k2++) kei3 = kei3 + A[k2 - 1];
						if(m > kei3) m = kei3;
						
						if(m > M) M = m;
						
						kei1 = 0;
						kei2 = 0;
						kei3 = 0;
						m = 2000000000;
				}
			}
			//1番目に切れ込みを入れるパターンしか計算されないので、バウムクーヘンを回す(配列を循環させる）
			tmp = A[0];
			for(int n2 = 0; n2 < N - 1; n2++) A[n2] = A[n2 + 1];
			A[N - 1] =tmp;
		}
		System.out.println(M);
	}
}
