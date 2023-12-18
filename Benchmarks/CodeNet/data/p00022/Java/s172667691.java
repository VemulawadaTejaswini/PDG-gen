import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (!str.equals("0")) {
			int n = Integer.parseInt(str);
			int[] num = new int[n];
			int max = 0 ;
			for (int i = 0; i < n; i++) {
				str = br.readLine();
				num[i] = Integer.parseInt(str);
				if(i==0)
					max=num[0];
				int sum = 0;
				for (int j = i; j >= 0; j--) {
					sum = sum + num[j];
					if (sum > max)
						max = sum;
				}
			}
			System.out.println(max);
			str = br.readLine();
		}
	}
}