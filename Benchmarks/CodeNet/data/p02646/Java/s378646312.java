import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int v = sc.nextInt();
    int b = sc.nextInt();
    int w = sc.nextInt();
    int t = sc.nextInt();
    long oni = 0;
    long nige = 0;
    String ans = "NO";
    for(int i = 1 ; i <= t ; ++i){
      oni = a + v*i;
      nige = b + w*i;
      if(oni==nige){
        ans = "YES";
        break;
      }
    }
    
    System.out.println(ans);
    
  }
}