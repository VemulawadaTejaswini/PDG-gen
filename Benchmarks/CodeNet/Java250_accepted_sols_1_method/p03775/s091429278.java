//-----------------------------------------------------------
// すぐ使える
//-----------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行目数字、2行目文字
		long N = Long.parseLong(br.readLine());

		long a=0;
		long b=0;
		
		a = (long)Math.floor(Math.sqrt(N));
		for(long i=0; i < N; i++){
			if( N % a == 0 ) {
				//割り切れたら、そこで比べる
				b = N / a;
				break;
			} else {
				a -= 1;
			}
		}
		
		long ans = Math.max(String.valueOf(a).length(), String.valueOf(b).length());

		//System.out.println(ans + ", a=["+a+"], b=["+b+"]");
		System.out.println(ans);
		return;
    }

}

//-----------------------------------------------------------
//-----------------------------------------------------------

