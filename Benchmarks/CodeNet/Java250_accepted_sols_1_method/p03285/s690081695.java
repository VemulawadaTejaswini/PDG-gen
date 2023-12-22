import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    while(N>=0){
      if(N %4 == 0 || N %7 == 0){
        System.out.println("Yes");
        return;
      }
      N -= 11;
    }
    System.out.println("No");
  }
}
