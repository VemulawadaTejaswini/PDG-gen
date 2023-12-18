import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    
    Scanner scan;
    int sheep;
    int wolves;
    
    sheep = 0;
    wolves = 0;
    
    scan = new Scanner(System.in);
    sheep = scan.nextInt();
    wolves = scan.nextInt();
    
    if (sheep > wolves){
      System.out.println("safe");
    }else {
      System.out.println("unsafe");
    }
      
  }
}
