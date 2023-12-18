import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public Main {
 boolean[] p;
 int MAX = 50001;
 void run() {
  p = new boolean[MAX];
  for(int i=2;i<MAX;i++) if(!p[i]) {
   for(int j=2*i;j<MAX;j+=i) p[j] = true;
  }
  Scanner sc = new Scanner(System.in);
  for(;;) {
   int n = sc.nextInt();
   if( n == 0 ) break;

   int cnt = 0;
   for(int i=2;i<n/2;i++) if(!p[n-i] && !p[i]) cnt++;
   if(n/2 == n-n/2 && !p[n/2]) cnt++;
   System.out.println(cnt);
  }
 }
 public static void main(String[] args) {
  new Main().run();
 }
}