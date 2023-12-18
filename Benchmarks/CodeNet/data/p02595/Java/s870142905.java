import java.util.Scanner;
import java.util.*;
public class Main{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	    long N=sc.nextLong();
	      long D=sc.nextLong();
	      int count=0;
	      while(N>0){
	      long X1=sc.nextLong();
	        long Y1=sc.nextLong();
	        double distance=Math.sqrt(X1*X1+Y1*Y1);
	          if(distance<=D){
	            count++;
	          }
	      N--;
	      }
	      System.out.println(count);
	    }
	  
}