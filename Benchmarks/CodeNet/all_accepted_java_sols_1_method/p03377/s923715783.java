import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = sc.nextInt();

    if(a>x){
      System.out.println("NO");
    }else{
      if(b>=x-a){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
  }
}
