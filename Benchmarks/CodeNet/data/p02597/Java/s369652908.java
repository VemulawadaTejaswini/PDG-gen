import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String s = scan.next();
    char[] t = new char[n];
    for (int i=0;i<n;i++){
      t[i] = s.charAt(i);
    }

    int ret = find(t,0,0,0,0,n,0);
    System.out.println(ret);


  }

  static int find(char[] a, int sum, int w, int r, int current, int n, int x){
    if (current == n-1){
      int more = Math.min(w,r);
      sum -= more;
      if (sum == 1){
        System.out.println(Arrays.toString(a));
        System.out.println(more);
      }
      return sum;
    }
    int ss = 0;

    if ((a[current] == 'W') && (a[current+1] == 'R')){
      a[current] = 'R';
      int sum1 = find(a,sum+x+1,w+x+1,r,current+1,n,0);
      a[current+1] = 'W';
      int sum2 = find(a,sum+1,w,r+1,current+1,n,x+1);
      ss = Math.min(sum1,sum2);
      return ss;
    }

    if (a[current] == 'W'){
      x += 1;
      ss = find(a,sum,w,r,current+1,n,x);
      return ss;
    }
    else{
      x = 0;
      ss = find(a,sum,w,r,current+1,n,x);
      return ss;
    }
  }
}
