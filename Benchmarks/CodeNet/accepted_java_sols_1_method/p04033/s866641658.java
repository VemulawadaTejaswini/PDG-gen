
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    if(a>0){
      System.out.println("Positive");
      return;
    }
    if(a<=0&&b>=0){
      System.out.println("Zero");
      return;
    }
    if((b-a+1)%2==0){
      System.out.println("Positive");
      return;
    }else{
      System.out.println("Negative");
    }

  }
  

  
}
