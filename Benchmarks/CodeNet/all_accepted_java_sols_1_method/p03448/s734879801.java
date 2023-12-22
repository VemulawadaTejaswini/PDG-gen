import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer a = Integer.valueOf(br.readLine());
		Integer b = Integer.valueOf(br.readLine());
		Integer c = Integer.valueOf(br.readLine());
		Integer x = Integer.valueOf(br.readLine());
		int result = 0;
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=b;j++) {
				int rest = x - 500 * i - 100 * j;
				if(rest >= 0 && rest % 50 == 0 && rest / 50 <= c) result++;
			}
		}
		System.out.println(result);
	}
}