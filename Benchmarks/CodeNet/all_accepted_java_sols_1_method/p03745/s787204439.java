import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1行目個数、2行目の複数の数字を配列に格納
		//   3
		//   1 2 3
		int N = Integer.parseInt(br.readLine());
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int[] ii0 = new int[N];
		for(int i = 0; i < N; i++){
			ii0[i] = Integer.parseInt(ss0[i]);
		}

		int ans = 1;
		int katamuki = 0;
		for(int i = 0; i < N-1; i++){
			if (ii0[i] == ii0[i+1]) { continue; }
			if (ii0[i] >  ii0[i+1]) {
				if( katamuki >= 0) { katamuki = 1; }
				if( katamuki <  0) {
					ans += 1;
					katamuki = 0;
				}
			}
			if (ii0[i] <  ii0[i+1]) {
				if( katamuki <= 0) { katamuki = -1; }
				if( katamuki >  0) {
					ans += 1;
					katamuki = 0;
				}
			}
		}

		//checkInput(ii0);
		
        System.out.println(ans);
        return;
    }


}
