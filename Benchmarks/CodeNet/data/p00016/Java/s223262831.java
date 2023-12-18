import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.math.*;

class Main{
	 public static void main(String[] args){
		 Scanner scan = new Scanner(System.in);
		 double y = 0.0;
		double x = 0.0;
		 int angle = 0;
		 while(true){
			String[] ak = scan.next().split(",");
			int a = Integer.parseInt(ak[0]);
			int b = Integer.parseInt(ak[1]);
			if(a == 0 && b == 0){
				break;
			}
			
			x = x+ a * Math.sin(Math.toRadians(angle));
			y = y+ a* Math.cos(Math.toRadians(angle));
			
			angle = angle + b;
			
		 }
			System.out.println((int)x);
			System.out.println((int)y);
	 }
}