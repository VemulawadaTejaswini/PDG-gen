import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int a;
          int b = 1;
          while(b<=n){
        	  a=b;
             if(a%3 == 0){
        	     System.out.print(" "+b);
             }
             else{
            	 while(a != 0){
            		 if(a%10 == 3){
            			 System.out.print(" "+b);
            			 break;
            		 }
            		 a = a/10;
            	 }
             }
             b=b+1;
          }
          System.out.println();
	}

}