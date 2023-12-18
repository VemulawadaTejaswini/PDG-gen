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

    ArrayList<Integer> a = new ArrayList<Integer>();
    ArrayList<Character> b = new ArrayList<Character>();

    int current = 0;
    char prev = t[0];
    int count = 1;

    for (int i=1;i<n;i++){
      if (t[i] == prev){
        count += 1;
      }
      else{
        a.add(count);
        b.add(prev);
        prev = t[i];
        count = 1;
      }

      if (i == n-1){
        a.add(count);
        b.add(prev);
      }
    }

    int ll = b.size();


    int ret = find(a,b,0,0,0,0,ll,0);
    System.out.println(ret);


  }

  static int find(ArrayList<Integer> a, ArrayList<Character> b, int sum, int w, int r, int current, int n, int x){
    if (current >= n-1){
      int more = Math.min(w,r);
      sum -= more;
      return sum;
    }

    int ss = 0;

    if ((b.get(current) == 'W') && (b.get(current+1) == 'R')){
      int sum1 = find(a,b,sum+a.get(current), w + a.get(current), r, current+2, n, 0);
      ArrayList<Integer> g = new ArrayList<Integer>();

      for (int k : a){
        g.add(k);
      }

      int o = 0;
      for (int c = current;c <= Math.min(n-1,current+2);c++){
        o += a.get(c);
      }

      if (current + 2 < n-1){
        g.set(current+2, o);
      }

      int sum2 = find(g,b,sum+a.get(current+1),w,r+a.get(current+1),current+2,n,x+1);
      ss = Math.min(sum1,sum2);
      return ss;
    }

    return ss;
  }
}
