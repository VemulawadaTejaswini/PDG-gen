import java.util.Scanner;
import java.io.*;
import java.math.*;

class Main {
	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int n = Integer.parseInt(br.readLine());
		
		Scanner scan = new Scanner(System.in);
		long min = 0;
		long max = 0;
		long sum = 0;
		long input_num;
		for (int i = 0; i < n; i++) {
			input_num = Long.valueOf(scan.nextInt());
			if (i == 0 || min > input_num) {
				min = input_num;
			}
			if (i == 0 || max < input_num) {
				max = input_num;
			}
			
			sum += Long.valueOf(input_num);
		}
		
		System.out.println(min +" "+ max +" "+ BigDecimal.valueOf(sum).toPlainString());
	}
}