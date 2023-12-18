import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long[] a = new long[n];
    long ans = 1;

    for(int i = 0; i < n; i++){
      a[i] = sc.nextLong();
      ans *= a[i];
        if(a[i] == 0){
          ans = 0;
          break;
        }else if(String.valueOf(ans).length() >= 18){
          ans = -1;
          break;
        }
    }

    System.out.println(ans);
  }
}
