import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);

		System.out.println(fac(n));
	}

	static long fac(int n){
		if(n==0){
			return 1;
		}else{
			return n*fac(n-1);
		}
	}

}