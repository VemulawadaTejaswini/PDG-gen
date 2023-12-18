import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int P = Integer.parseInt(str[0]);
		int Q = Integer.parseInt(str[1]);
		int R = Integer.parseInt(str[2]);

		int a = P+Q;
		int b = Q+R;
		int c = R+P;

		if(a<=b && a<=c) {
			System.out.print(a);
		}else if(b<=a && b<=c) {
			System.out.print(b);
		}else if(c<=a && c<=b) {
			System.out.print(c);
		}



	}

}
