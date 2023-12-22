import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int t = sc.nextInt();
      int a = sc.nextInt();
      double[] h = new double[n];
      for(int i=0;i<n;i++){
        h[i] = sc.nextInt();
      }
      int kokonishirowotateyou = 0;
      double gosa = 10000;
      for(int i=0;i<n;i++){
        h[i] = t-(h[i]*0.006);
        h[i] = Math.abs(h[i]-a);
        if(gosa>h[i]){
          kokonishirowotateyou = i;
          gosa = h[i];
        }
      }
      System.out.println(kokonishirowotateyou+1);
    }
}