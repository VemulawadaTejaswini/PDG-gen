import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] b = new int[n];
    if (n < 6){
      for (int i=0;i<n;i++){
        System.out.println(b[i]);
      }
      return;
    }

    int limit = (int) Math.sqrt(n-2);

    int [] a = new int[]{1,1,1};

    while (a[0] < limit){
      int t = cal(a[0],a[1],a[2]);
      if (t<=n){
        b[t-1] += check(a[0],a[1],a[2]);
      }
      a = per(a);
    }

    for (int i=0;i<n;i++){
      System.out.println(b[i]);
    }



  }

  static int[] per(int[] a){
      int x = a[0];
      int y = a[1];
      int z = a[2];
      if (z<y){
        a[2] += 1;
        return a;
      }
      if (y<x){
        a[1] += 1;
        a[2] = 1;
        return a;
      }
      a[0] += 1;
      a[2] = 1;
      a[1] = 1;
      return a;
  }

  static int cal(int a, int b, int c){
    int n = a*a+b*b+c*c+a*b+a*c+b*c;
    return n;
  }

  static int check(int a, int b, int c){
    if (a == b){
      if (b == c){
        return 1;
      }
      else{
        return 3;
      }
    }
    else{
      if (b == c){
        return 3;
      }
    }
    return 6;
  }
}
