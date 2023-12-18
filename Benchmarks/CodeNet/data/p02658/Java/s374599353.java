import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long[] a = a[n];
    long ans = 0;

    for(int i = 0; i < n; i++){
      a[i] = sc.nextLong();
      ans += a[i];
        if(ans > Math.pow(10, 18)){
          ans = -1;
          break;
        }
    }

    System.out.println(ans);
  }
}
