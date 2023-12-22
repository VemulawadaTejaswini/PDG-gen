import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		long a, b, c, count = 0;
		a = Long.parseLong(strArr[0]);
		b = Long.parseLong(strArr[1]);
		c = Long.parseLong(strArr[2]);
		for(long i = a;i <= b;i++){
			count += (c % i == 0)?1:0;
		}
		System.out.printf("%d%n", count);
	}
}