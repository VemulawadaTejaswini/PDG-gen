import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = br.readLine()) != null) {
			int num = Integer.parseInt(str);
			int count =0;
			int n = (int)Math.sqrt(num);
			int[] list = new int[num];
			Arrays.fill(list,1);
			list[0] = 0;
			for (int i = 2; i < n + 1; i++) {
				if (list[i-1] != 0) {
					for (int j = 2; j <= num; j++) {
						if (j % i == 0){
							list[j-1] = 0;
						}
					}
				count++;
				}
			}
			for (int i = 2; i <= num; i++) {
				count = count + list[i-1];
			}
			System.out.println(count);
		}
	}
}