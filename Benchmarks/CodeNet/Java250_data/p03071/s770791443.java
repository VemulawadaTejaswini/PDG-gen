import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = 0;
    int y = 0;
    if(a>b){
      x = a;
      y = b;
    }else{
      x = b;
      y = a;
    }
    if(x-y>=2){
      System.out.println(2*x-1);
    }else{
      System.out.println(x+y);
    }
  }
}
