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
		if(n == want) {
			for(int i = 0; i < neg; i++)
				result = (modulo(nega[i], modulo) * result) % modulo;
			for(int i = n - 1; i >= n - pos; i--) {
				result = (posi[i] % modulo * result) % modulo;
			}
		}
		else if(pos != 0) {
			int temp = 1;
			int temp2 = 0;
			while(want > 0 && temp2 < neg && temp <= pos) {
				if(posi[n - temp] * posi[n - temp - 1] > nega[temp] * nega[temp2 + 1]) {
					result = result * (posi[n - temp] * posi[n - temp - 1] % modulo) % modulo;
					temp += 2;
					want -= 2;
				}
				else {
					result = result * (nega[temp2] * nega[temp2 + 1] % modulo) % modulo;
					temp2 += 2;
					want -= 2;
				}
			}
			while(want > 0 && temp2 < neg) {
				result = result * (nega[temp2] * nega[temp2 + 1] % modulo) % modulo;
				temp2 += 2;
				want -= 2;
			}
			
			while(want > 0 && temp <= pos) {
				result = result * (posi[n - temp] * posi[n - temp - 1] % modulo) % modulo;
				temp += 2;
				want -= 2;
			}
		}
		else {
			if(want % 2 == 0)
				for(int i = 0; i < want; i++)
					result = (modulo(nega[i], modulo) * result) % modulo;
			else
				for(int i = n - 1; i >= n - want; i--)
					result = (modulo(nega[i], modulo) * result) % modulo;
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
