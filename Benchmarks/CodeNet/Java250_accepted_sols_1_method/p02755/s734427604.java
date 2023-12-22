import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		String[] Ws = W.split(" ");
		long[] A = new long[Ws.length];
		for (int i = 0; i < Ws.length; i++) {
			A[i] = Long.parseLong(Ws[i]);
		}

		long ans = 1;
		for(;ans<=1000;ans++){
			if(Math.floor(ans * 0.08) == A[0] && Math.floor(ans * 0.1) == A[1]){
				break;
			}
		}
		if(ans == 1001){
			ans = -1;
		}
		System.out.println(ans);
	}


}
