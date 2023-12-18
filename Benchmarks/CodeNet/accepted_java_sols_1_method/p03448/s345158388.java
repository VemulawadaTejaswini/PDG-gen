import java.util.*;
public class Main {
	  static int solve=0;
      public static void main(String[]args) {
    	  Scanner scan=new Scanner(System.in);
    	  int a=scan.nextInt();
    	  int b=scan.nextInt();
    	  int c=scan.nextInt();
    	  int x=scan.nextInt();
    	  int numa=x/500;
    	  int i=0;
    	  while(i<=numa&&i<=a) {
    		  int numb=(x-i*500)/100;
    		  int j=0;
    		  while(j<=numb&&j<=b) {
    			  int numc=(x-i*500-j*100)/50;
    			  if(numc<=c) {
    				  solve++;
    			  }
    			  j++;
    		  }
    		  i++;
    	  }
    	  System.out.println(solve);
      }
}
