import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(x==1&&y==1){
      System.out.println(1000000);
      return;
    }
    int ans = 0;
    if(x==1)ans+=300000;
    if(x==2)ans+=200000;
    if(x==3)ans+=100000;
    if(y==1)ans+=300000;
    if(y==2)ans+=200000;
    if(y==3)ans+=100000;
    System.out.println(ans);
  }
}