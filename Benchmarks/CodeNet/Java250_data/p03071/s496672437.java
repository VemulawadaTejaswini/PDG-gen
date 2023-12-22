import java.util.*;
public class Main{
  public static void main(String[] augs){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    
    if (a > b){
      count += a;
      a = a-1;
    } else {
      count += b;
      b = b-1;
    }
    if (a > b){
      count += a;
      a = a-1;
    } else {
      count += b;
      b = b-1;
    }
    
    System.out.println(count);
  }
}