import java.io.PrintWriter;
import java.util.*;

import static java.lang.Math.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		PrintWriter out=new PrintWriter(System.out);
		int ans = sc.nextInt();
		int count=0;
		for (int a = 0; a < 10; a++ ){
			for (int b = 0; b < 10; b++ ){
				for (int c = 0; c < 10; c++ ){
					for (int d = 0; d < 10; d++ ){
					int sum = a + b + c + d;
						if(sum == ans )count++ ;
					}
				}
			}
		}
		System.out.println(count);
		
	}

}


	