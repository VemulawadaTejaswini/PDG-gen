import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			String s = sc.next();
			int a = Integer.parseInt(s.substring(0,1));
			int b = Integer.parseInt(s.substring(1,2));
			int c = Integer.parseInt(s.substring(2,3));
			int d = Integer.parseInt(s.substring(3,4));

			if (a+b+c+d == 7) {
				System.out.println(a +"+"+b+"+"+c+"+"+d+"=7");
			}else if(a+b+c-d == 7){
				System.out.println(a +"+"+b+"+"+c+"-"+d+"=7");
			}else if (a+b-c+d == 7) {
				System.out.println(a +"+"+b+"-"+c+"+"+d+"=7");
			}else if (a+b-c-d == 7) {
				System.out.println(a +"+"+b+"-"+c+"-"+d+"=7");
			}else if (a-b+c+d == 7) {
				System.out.println(a +"-"+b+"+"+c+"+"+d+"=7");
			}else if (a-b+c-d == 7){
				System.out.println(a +"-"+b+"+"+c+"-"+d+"=7");
			}else if (a-b-c+d == 7) {
				System.out.println(a +"-"+b+"-"+c+"+"+d+"=7");
			}else{
				System.out.println(a +"-"+b+"-"+c+"-"+d+"=7");
			}

		    sc.close(); }
}
