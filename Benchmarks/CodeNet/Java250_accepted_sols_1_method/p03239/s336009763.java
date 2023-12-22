import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int c1;
    int t1;
    int cmin = 1024;
    for(int i=0; i<n; i++){
      c1 = sc.nextInt();
      t1 = sc.nextInt();
      if(t1 <= t){
        if(c1 < cmin)
          cmin = c1;
      }
    }
    if(cmin == 1024)
      System.out.println("TLE");
    else
      System.out.println(cmin);
  }
}
