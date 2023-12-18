//import java.io.*;
import java.util.*;
//import java.math.*;
public class Main {
 
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
     while(true){
    	 int n= scan.nextInt();
    	 if(n==0)break;
      	 int m2=0;
    	 int m5 =0;
    	 for(int i=n;i>0;i--){
    	int k=i;
    		 while(k%2==0|| k%5==0){
    	 if(k%10==0){m2++;m5++; k/=10;}
    	 else if(k%2==0){m2++;k/=2;}
    	 else if(k%5==0){m5++;k/=5;}
    	 }
    	 }
     System.out.println(Math.min(m2, m5));
     }
    }
}