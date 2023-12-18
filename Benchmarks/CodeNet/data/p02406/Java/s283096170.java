import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		call(n);
	}

	private static void call(long n) {
		StringBuilder sb = new StringBuilder();
		for(long i = 1;i <= n;i++){
			if(i % 3 == 0 || String.valueOf(i).indexOf("3") != -1){
				sb.append(String.format(" %d", i));
			}
		}
		System.out.println(sb.toString());
	}

}