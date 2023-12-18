import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{
	 public static void main(String[] args)throws IOException{
		 Scanner sc = new Scanner(System.in);
		 
			 int a = sc.nextInt();
			 double akata = 0.0;
			 double bkata = 0.0;
			 
			 for(int i =0;i < a;i++){
				 double x1 = sc.nextDouble();
				 double y1 = sc.nextDouble();
				 double x2 = sc.nextDouble();
				 double y2 = sc.nextDouble();
				 double x3 = sc.nextDouble();
				 double y3 = sc.nextDouble();
				 double x4 = sc.nextDouble();
				 double y4 = sc.nextDouble();
				 
				 akata = (y2-y1)/(x2-x1);
				 bkata = (y4-y3) /(x4-x3);
				 
				 if(akata != bkata){
					 System.out.println("NO");
				 }else{
					 System.out.println("YES");
				 }
				 
				 
			 }

    }
}