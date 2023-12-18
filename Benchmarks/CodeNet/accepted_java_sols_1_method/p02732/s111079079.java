import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] data = br.readLine().split(" ");
    int[] a = new int[n];
    long[] counts = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(data[i]) - 1;
      counts[a[i]]++;
    }

    long ans = 0;
    for(int i = 0; i < n; i++){
      if(counts[i] > 1){
        ans += (counts[i] * (counts[i] - 1)) / 2;
      }
    }
    for(int i = 0; i < n; i++){
      long count = counts[a[i]];
      if(count > 1){
        long add   = ((counts[a[i]] - 1) * (counts[a[i]] - 2)) / 2;
        long minus = (counts[a[i]] * (counts[a[i]] - 1)) / 2;
        System.out.println(ans - minus + add);
      } else {
        System.out.println(ans);
      }
    }
  }
}