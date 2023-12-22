import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int ans = 1;
    int place = 0;
    for(int i=0;i<n;i++){
      int a = sc.nextInt();
      place += a;
      if(place <= x){
        ans++;
      }
    }
    System.out.println(ans);
  }
}