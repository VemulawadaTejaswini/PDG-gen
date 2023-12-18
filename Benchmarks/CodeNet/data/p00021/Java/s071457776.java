import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 
			 int a = sc.nextInt();

			 while(a-- != 0){
				 double x1 = sc.nextDouble();
				 double y1 = sc.nextDouble();
				 double x2 = sc.nextDouble();
				 double y2 = sc.nextDouble();
				 double x3 = sc.nextDouble();
				 double y3 = sc.nextDouble();
				 double x4 = sc.nextDouble();
				 double y4 = sc.nextDouble();
				  if(x1 == x2 && x3 == x4){
					 System.out.println("YES");
				 }else if(x1 == x2||x3 == x4){
					 System.out.println("NO");
				 }else{

		                double a1 = (y2 - y1) / (x2 - x1);
		                double a2 = (y4 - y3) / (x4 - x3);
				 if(a1 == a2){
					 System.out.println("YES");
				 }
				 else{
					 System.out.println("NO");
				 }
				 }	
			 }
    }
}