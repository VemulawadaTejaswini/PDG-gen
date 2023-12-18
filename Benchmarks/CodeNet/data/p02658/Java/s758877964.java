import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long[] a = new long[n];
    long ans = 1;

    for(int i = 0; i < n; i++){
      a[i] = sc.nextLong();
      
        if(a[i] == 0){
          ans = 0;
          break;
        } else if(ans * a[i] > (long)Math.pow(10, 18)){
          ans = -1;
          break;
        } else {
          ans *= a[i];
        }
    }

    System.out.println(ans);
  }
}
