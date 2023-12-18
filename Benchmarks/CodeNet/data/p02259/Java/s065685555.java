import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		String[] str = (br.readLine()).split(" ");
		for (int i = 0; i<n ; i++ ) {
			num[i] = Integer.parseInt(str[i]);
		}
		int count = 0;
		for (int i = 0 ; i<num.length ; i++  ) {
			for (int j = num.length-1; j>=i+1 ; j-- ) {
				if ( num[j] < num[j-1]) {
					int work = num[j];
					num[j] = num[j-1];
					num[j-1] = work;
					count++; 
				}
			}
		}
		for (int i = 0; i<num.length ; i++ ) {
			if ( i == num.length-1) {
				System.out.println(num[i]);
			}else{
				System.out.print(num[i] + " ");
			}
		}
		System.out.println(count);
	}
}