//Curtain
import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=b*2;

    if (a>c) {
      System.out.println(a-c);
    }else{
      System.out.println("0");
    }
  }
}
