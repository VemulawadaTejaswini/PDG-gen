import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long a=sc.nextLong(),v=sc.nextLong(),b=sc.nextLong(),w=sc.nextLong(),t=sc.nextLong();
    
    long g=0;
    
      if(a<b){
        if(a+(long)Math.abs(v)*t<b+(long)Math.abs(w)*t){
          System.out.println("NO");
        }else{
          System.out.println("YES");
        }
      }else{
        if(a-(long)Math.abs(v)*t<=b-(long)Math.abs(w)*t){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
      }
      
      
    
    
    
  }
}
