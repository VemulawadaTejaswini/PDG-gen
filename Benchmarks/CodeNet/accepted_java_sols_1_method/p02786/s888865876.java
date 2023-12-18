import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		long h = scan.nextLong();
		
		int ans = 0;
		
		long two[] = new long[40];
		two[0] = 1;
		for(int i = 1; i < 40; i++){
			two[i] = two[i-1]*2;
		}
		
		long twoadd[] = new long[40];
		twoadd[0] = 1;
		for(int i = 1; i < 40; i++){
			twoadd[i] = twoadd[i-1] + two[i];
		}
		
		while((h /= 2) != 0)ans++;
		
		System.out.println(twoadd[ans]);
	}
}