import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] a = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    br.close();
    long sum = 0;
    int prev = a[0];
    for(int i = 1; i < n; i++){
      if(prev > a[i]) {
        sum += (long)prev - a[i];
      }
      prev = Math.max(prev, a[i]);
    }
    System.out.println(sum);
  }
}