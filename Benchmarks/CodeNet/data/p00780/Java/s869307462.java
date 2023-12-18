import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main { 
 boolean[] p;
 int MAX = 1<<16;
 void run() {
  Scanner sc = new Scanner(System.in);
  p = new boolean[MAX+1];
  p[0] = p[1] = true;
  for(int i=2;i<=MAX;i++) if(!p[i]) {
   for(int j=2*i;j<=MAX;j+=i) p[j] = true;
  }
  for(;;) {
   int n = sc.nextInt();
   if( n == 0 ) break;
   int cnt = 0;
   for(int i=2;2*i<=n;i++) if(!p[i] && !p[n-i])
    cnt++;
   System.out.println(cnt);
  }
 }
 public static void main(String[] args) {
  new Main().run();
 }
}