import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    double ans = 0;
    double count;
    for(int i = 1;i<=n;i++){//saikoro no me
      count = 0;
      int point = i;
      while(point<k){
        point*=2;
        count++;
      }
      point = 1;
      while(count!=17){
        count++;
        point*=2;
      }
      ans+=point;
    }
    ans/=(double)n;
    ans/=131072;
    System.out.println(ans);
  }
}
