

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String[] line = br.readLine().split(" ");
		long n = Long.parseLong(line[0]);
		long a = Long.parseLong(line[1]);
		long b = Long.parseLong(line[2]);
		br.close();
		long blue = 0;
		if(a == 0) {
			blue = 0;
		}else {
			long mod = n%(a+b);
			long div = n/(a+b);
			if(mod==0 || mod<=a) {
				blue = a * div + mod;
			}else {
				blue = a * div + a;
			}
		}
		System.out.println(blue);
	}
}
