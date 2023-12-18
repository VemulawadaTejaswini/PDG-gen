//package agc047;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		double[] ary = new double[N];
		
		for(int i = 0 ; i < N ; i++) {
			ary[i] = Double.parseDouble(br.readLine());
		}
		
		long cnt = 0;
		
		for(int i  = 0 ; i < N ; i++) {
			for(int j = i+1 ; j < N ; j++) {
				double val = (ary[i]*1e9)*(ary[j]*1e9) / 1e9 / 1e9;
				if(Math.floor(val) == val)
					cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	
}
