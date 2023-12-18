
import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      for (int i = 1; i <= n; i++) {
          
          if (i % 3 == 0) {
              System.out.print(" "+i);
               
          }else if (i % 10 == 3){
        	  System.out.print(" "+i);
          }
           
          int temp = i / 10;
          while (temp != 0 ){
               
              if (temp % 10 == 3) {
            	  System.out.print(" "+i);
                  break;
              }
               
              temp /= 10;
          }
      }
	
  }
}