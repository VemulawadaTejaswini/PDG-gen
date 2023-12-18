import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		int modulo = (int) 1e9 + 7;
		int n = scanner.nextInt();
		int want = scanner.nextInt();
		int pos = 0;
		int neg = 0;
		int[] nega = new int[n];
		int[] posi = new int[n];
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < n; i++) {
			int temp = scanner.nextInt();
			if(temp < 0) {
				nega[neg] = temp;
				neg++;
			}
			else {
				posi[pos] = temp;
				pos++;
			}
		}
		Arrays.sort(nega);
		Arrays.sort(posi);
		long result = 1l;
		if(want % 2 == 1 && pos > 0) {
			result *= 1l * posi[n - 1];
			pos--;
			want--;
		}
		while(want > 0 && neg > 1 && pos > 1) {
			long temp1 = posi[n - 1] * posi[n - 2];
			long temp2 = nega[neg - 1] * nega[neg - 2];
			if(temp1 > temp2) {
				result *= 1l * (temp1 % modulo);
				pos -= 2;
				n -= 2;
			}
			else {
				result *= 1l * (temp2 % modulo);
				neg -= 2;
				result %= modulo;
			}
			want -= 2;
		}
		if(want != 0) {
			while(want > 0 && pos > 0) {
				result = 1l * (result * (posi[n - 1] % modulo)) % modulo;
				pos--;
				want--;
				n--;
			}
			
			while(want > 0 && neg > 0) {
				int temp = modulo(nega[neg - 1], modulo);
				result = 1l * (result * temp) % modulo;
				neg--;
				want--;
			}
		}
		log.write("" + result);
		log.flush();
	}

	private static int modulo(int i, int modulo) {
		if(i < 0)
			i *= -1;
		i %= modulo;
		if(i == 0)
			return 0;
		return modulo - i;
	}
}
