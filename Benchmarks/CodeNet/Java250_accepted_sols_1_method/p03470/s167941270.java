import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] d = new int[N];
    for(int i=0;i<N;i++){
      d[i] = sc.nextInt();
    }
    Arrays.sort(d);
    int x = d[0];
    int ans = 1;
    for(int i=0;i<d.length;i++){
      if(x!=d[i]){
        ans++;
        x = d[i];
      }
    }
    System.out.println(ans);
  }
}