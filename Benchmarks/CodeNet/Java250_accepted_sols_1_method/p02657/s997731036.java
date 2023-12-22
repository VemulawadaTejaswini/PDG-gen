import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(1 <= a && a <= 100){
      if(1 <= b && b <= 100){
        System.out.println(a * b);
      }
    }
  }
}