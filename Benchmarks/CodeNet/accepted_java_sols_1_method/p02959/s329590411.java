import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
    int a[] = new int[n+1];
    int b[] = new int[n];
    long sb = 0;
    long sa = 0;
    
    for (int i=0; i<n+1; i++){
      a[i] = Integer.parseInt(sc.next());
      sb += a[i];
    }
    for (int i=0; i<n; i++){
      b[i] = Integer.parseInt(sc.next());
    }

    for(int i=0; i<n; i++){
      if (b[i] >= a[i]) {
        b[i] -= a[i];
        a[i] = 0;
        if (b[i] >= a[i+1]) {
          b[i] -= a[i+1];
          a[i+1] = 0;
        } else {
          a[i+1] -= b[i];
          b[i] = 0;
        }
      } else {
        a[i] -= b[i];
        b[i] = 0;
      }
    }
    
    for (int i=0; i<n+1; i++){
      sa += a[i];
    }
    
	System.out.println(sb-sa);


  }
}
