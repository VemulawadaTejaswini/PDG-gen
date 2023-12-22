import java.io.*;
import java.math.*;

class Main {
	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int n = Integer.parseInt(br.readLine());
		
		long min = 0;
		long max = 0;
		long sum = 0;
		long input_num;
		
		String input = br.readLine();
		String[] sz_num = input.split(" ");
		
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(sz_num[i]);
			
			if (i == 0 || min > tmp) {
				min = tmp;
			}
			if (i == 0 || max < tmp) {
				max = tmp;
			}
			
			sum += Long.valueOf(tmp);
		}
		
		System.out.println(min +" "+ max +" "+ sum);
	}
}