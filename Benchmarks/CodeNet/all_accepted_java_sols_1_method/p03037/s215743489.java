import java.util.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int m = stdIn.nextInt();
    long[] l = new long[m];
    long[] r = new long[m];
    for(int i = 0;i<r.length;i++) {
      l[i] = stdIn.nextInt();
      r[i] = stdIn.nextInt();
    }
    long maxGate = 1000000000;
    long minGate = 0;
    for(int i = 0;i<l.length;i++) {
      minGate = Math.max(minGate,l[i]);
      maxGate = Math.min(maxGate,r[i]);
    }
    long count = maxGate - minGate + 1;
    if(count<=0) System.out.println(0);
    else System.out.println(count);
  }
}
