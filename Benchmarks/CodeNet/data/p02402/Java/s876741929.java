import java.util.*;
 
class Main {
      
    public static void main(String[] args) {
         
       Scanner cin=new Scanner(System.in);
       
       int n=cin.nextInt();
       int sum=0;
       int max=-1000000,min=1000000;
       for(int i=0;i<n;i++) {
    	   int x=cin.nextInt();
    	   max=Math.max(max, x);
    	   min=Math.min(min, x);
    	   sum+=x;
       }
       System.out.println(min+" "+max+" "+sum);
       
    }
     
 
}
