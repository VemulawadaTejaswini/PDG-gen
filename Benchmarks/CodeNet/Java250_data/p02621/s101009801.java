import java.util.*;
 
class Main{
  
  public static void main(String args[])
  {
    
    Scanner s = new Scanner(System.in);
      
      int a = s.nextInt();
    	
    long sum=0;
    
    sum=(long)(a+Math.pow(a,2)+Math.pow(a,3));
    
    System.out.println(sum);
    
  }
  
  
}