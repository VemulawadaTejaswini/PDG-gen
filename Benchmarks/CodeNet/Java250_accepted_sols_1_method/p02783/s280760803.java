import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int a = sc.nextInt();
    
    int num = 0;
    while(h > 0){
      num += 1;
      h -= a;
    }
    
    System.out.println(num);
  }
}