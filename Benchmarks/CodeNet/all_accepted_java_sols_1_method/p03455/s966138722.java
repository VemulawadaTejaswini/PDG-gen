import java.util.*;

public class Main{
	public static void main(String[] args){
      
      Scanner sn = new Scanner(System.in);
      
      int a = sn.nextInt();
      int b = sn.nextInt();
      
      int c = (a*b)%2;
      
      if(c==0){
      	System.out.println("Even");
      }else{
      	System.out.println("Odd");
      }
        
    }
}