import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n, i;
		int sum, min = 0, max = 0, tmp = 0;

		for(;;){
			sum = 0;
			n = sc.nextInt();
			if(n == 0){
				return;
			}
			for(i = 0; i < n; i++){
				tmp = sc.nextInt();
				sum += tmp;
				if(i == 0){
					max = tmp;
					min = tmp;
				} else{
					if(tmp > max){
						max = tmp;
					}
					if(tmp < min){
						min = tmp;
					}
				}
			}
			sum -= min;
			sum -= max;

			sum /= n - 2;

			System.out.println(sum);
		}
	}
}