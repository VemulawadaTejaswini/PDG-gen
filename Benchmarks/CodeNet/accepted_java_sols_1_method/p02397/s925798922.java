import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,b;
    while(1==1){
      a = sc.nextInt();
      b = sc.nextInt();
      if(a==0 && b==0)  break;
      if(a>b){
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
      }
      System.out.println(a+" "+b);
    }
  }
}
