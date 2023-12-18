import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
    long[] a = new long[n];
    boolean f = false;
    boolean f1 = true;
    for(int j=0; j<n; j++) {
      a[j] = sc.nextLong();
      if(a[j] == 0) f = true;
      if(a[j] != (long)Math.pow(10,18)) f1 = false;
    }
    long ans = 1;

    for(int i=0; i<n; i++) {
      ans *= a[i];
      if(ans > (long)Math.pow(10,18)) break;
    }
    if(f == true) System.out.println(0);
    else if(ans > (long)Math.pow(10, 18) || f1 == true) System.out.println(-1);
    else System.out.println(ans);
  }
}
