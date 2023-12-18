import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Main {

  static final String PAIRWISE = "pairwise coprime";
  static final String SETWISE = "setwise coprime";
  static final String NOT = "not coprime";

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] data = br.readLine().split(" ");
    br.close();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = Integer.parseInt(data[i]);
    }
    int allGcd = a[0];
    int idx = 1;
    while(allGcd != 1 && idx < n){
      allGcd = gcd(allGcd, a[idx]);
      idx++;
    }
    if(allGcd == 1){
      int max = IntStream.of(a).max().getAsInt();
      EratosthenesSieve sieve = new EratosthenesSieve(max);
      TreeSet<Integer> set = new TreeSet<>();
      for(int i = 0; i < n; i++){
        int num = a[i];
        while(num > 1){
          int multiple = sieve.minimumMultiple(num);
          if(set.contains(multiple)){
            System.out.println(SETWISE);
            return;
          } else {
            set.add(multiple);
          }
          while(num % multiple == 0){
            num /= multiple;
          }
        }
      }
      System.out.println(PAIRWISE);
    } else {
      System.out.println(NOT);
    }
  }
  static int gcd(int a, int b){
    return b == 0 ? a : gcd(b, a % b);
  }
}
class EratosthenesSieve {
  int div[];
  EratosthenesSieve(int n){
    if (n < 2) return;
    div = new int[n + 1];
    Arrays.setAll(div, i -> i);
    int end = (int)Math.sqrt(n) + 1;
    for(int i = 2; i <= end; i++){
      int multiple = i;
      while(multiple <= n){
        div[multiple] = i;
        multiple += i;
      }
    }
  }
  boolean isPrimeNumber(int n){
    if(n <= 1) return false;
    return div[n] == n;
  }
  int minimumMultiple(int n){
    return div[n];
  }
}