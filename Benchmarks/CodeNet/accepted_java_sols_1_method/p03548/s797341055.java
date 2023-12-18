import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			int wid = sc.nextInt();
			int hum = sc.nextInt();
			int sp = sc.nextInt();
			int ans = 0;

			while((hum + sp)*ans + sp <= wid ){
				ans++;
			}

			System.out.println(ans-1);

		    sc.close(); }
}
