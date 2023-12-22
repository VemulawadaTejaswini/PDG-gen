import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int val1 = scan.nextInt();
    String val2 = scan.next();
    int val3 = scan.nextInt();
    
    if (val2.equals("+")){
      System.out.print(val1 + val3);
    }else{
      System.out.print(val1 - val3);
    }
    
    
  }
}