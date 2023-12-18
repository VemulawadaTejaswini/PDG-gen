import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String str = br.readLine();
		int N = Integer.parseInt(str);
		long[] A = new long[N];
		long m = 100000000000L, M = 0L;
		long kei1 = 0L, kei2 = 0L, kei3 = 0L;//3つの切り分けた領域の合計を表す
		
		for(int i = 0; i < N; i++){
			str = br.readLine();
			A[i] = Integer.parseInt(str);
		}
		
		//主処理
		for(int i = 1; i < N - 1; i++){
			for(int j = i + 1; j < N; j++){
				for(int k = j + 1; k < N + 1; k++){
					for(int i2 = i; i2 < j; i2++) kei1 = kei1 + A[i2 - 1];
					if(m > kei1) m = kei1;
					for(int j2 = j; j2 < k; j2++) kei2 = kei2 + A[j2 - 1];
					if(m > kei2) m = kei2;
					for(int k2 = k; k2 <= N; k2++) kei3 = kei3 + A[k2 - 1];
					if(i > 1){
						for(int l = 1;l < i; l++) kei3 = kei3 + A[l - 1];
					}
					if(m > kei3) m = kei3;
					
					if(m > M) M = m;
					
					kei1 = 0L;
					kei2 = 0L;
					kei3 = 0L;
					m = 100000000000L;
				}
			}
		}
		System.out.println(M);
	}
}
