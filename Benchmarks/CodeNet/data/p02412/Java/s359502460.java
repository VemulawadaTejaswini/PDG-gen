import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buffer[] = new String[2];
		int N,X,ans;

		while(true){

			try {
				buffer = br.readLine().split("\\s+");
				N = Integer.parseInt(buffer[0]);
				X = Integer.parseInt(buffer[1]);

				if(N == 0 && X == 0)break;

				ans = 0;

				for(int a = 1; a <= N-2; a++){
					for(int b = a+1; b <= N-1; b++){
						for(int c = b+1; c <= N; c++){
							if(a+b+c == X){
								ans++;
							}
						}
					}
				}

				System.out.printf("%d\n", ans);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


