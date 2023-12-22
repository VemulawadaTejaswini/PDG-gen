import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = Integer.toString(a) + Integer.toString(b);
    int i = Integer.parseInt(s);
    double result = (int)Math.sqrt(i);
    if(result*result == i){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
