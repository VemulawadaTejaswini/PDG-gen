import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int b = n%10;
    if (b==3){
      System.out.println("bon");
      return;
    }
    if ((b==0)||(b==1)||(b==6)||(b==8)){
      System.out.println("pon");
      return;
    }
    System.out.println("hon");
  }
}
