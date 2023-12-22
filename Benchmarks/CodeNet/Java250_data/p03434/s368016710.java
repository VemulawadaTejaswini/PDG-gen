import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for (int i = 0; i < n; i++){
      a[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(a);
    int ans = 0;
    boolean flag = true;
    for (int i = n-1; i >= 0; i--){
      if (flag == true){ans += a[i];}
      else{ans -= a[i];}
      flag ^= true;
    }
    System.out.println(ans);
  }
}