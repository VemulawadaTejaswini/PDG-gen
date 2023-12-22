import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
	   int a,b,c,d,e;
	   a=1;b=1;e=1;
       Scanner sc = new Scanner(System.in);
       while (a!=0 || b!=0){
       a = sc.nextInt();
       b = sc.nextInt();
       c = 1;
       d = 1;
       if (e != 1){
    	   System.out.println();
       }
       while(c<=a){
    	   while(d<=b){
    		   if(d!=b){
    			   System.out.print("#");
    		   }else{
    			   System.out.println("#");
    		   }
    		   d = d+1;
    	   }
    	   c = c+1;
    	   d = 1;
       }
       e=e+1;
       }
	}

}