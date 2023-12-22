import java.util.Scanner;

class Main {
  
  public static void main(String args[]) {
    
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int x = n%10;
    
    if(x == 3)
      System.out.print("bon");
  	else if(x == 0 || x == 1 || x == 6 || x == 8)
       System.out.print("pon");
    else 
       System.out.print("hon");

  }
  
}
  
  
  
  

