import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0 ; i<n ; i++ ) {
			int num = Integer.parseInt(br.readLine());
			if ( num == 2 || num == 3) {
				sum++;
				continue;
			}
			double nd = (double) num;
			nd = Math.sqrt(nd);
			int a = (int) nd;
			if ( num % 2 == 1) {
				for (int j = 2; j<=a ; j++ ) {
					if ( num%j == 0 ) {
						break;
					}else if( j == a){
						sum++;
					}

				}
			}
		}
		System.out.println(sum);
	}
}