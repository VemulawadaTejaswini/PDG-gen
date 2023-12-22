import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] d = new int[N];
    for (int i=0;i<d.length;i++){
      d[i] = sc.nextInt();
    }
    Arrays.sort(d);
    int ans = 1;
    for (int i=1;i<d.length;i++){
      if (d[i-1] < d[i]){
        ans = ans + 1;
      }
    }
    System.out.println(ans);
  }
}