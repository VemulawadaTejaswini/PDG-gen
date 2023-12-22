import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(),b = sc.nextInt(),x = sc.nextInt();
    int c = a+b;
    if(a <= x && x <= c){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
