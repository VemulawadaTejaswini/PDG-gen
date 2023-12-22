import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inNM = br.readLine().split(" ");
		int N = Integer.parseInt(inNM[0]);
		int M = Integer.parseInt(inNM[1]);
		
		int[][] submit = new int[M][2];
		int[][] result = new int[N+1][3];
		
		for(int s=0; s<M; s++) {
			String[] inS = br.readLine().split(" ");
			submit[s][0] = Integer.parseInt(inS[0]);
			
			if(inS[1].contentEquals("AC")) {
				submit[s][1] = 1;
			}	
		}
		
		for(int m=0; m<M; m++) {
			if(submit[m][1] == 1) {
				result[submit[m][0]][1] = 1;
			}else {
				if(result[submit[m][0]][1] != 1) {
					result[submit[m][0]][2] ++;
				}
			}
		}
		
		int ac = 0;
		int wa = 0;
		
		for(int n=1; n<N+1; n++) {
			if(result[n][1] == 1) {
				ac += result[n][1]; 
				wa += result[n][2];
			}
		}
		
		System.out.println(ac+" "+wa);
	}
}