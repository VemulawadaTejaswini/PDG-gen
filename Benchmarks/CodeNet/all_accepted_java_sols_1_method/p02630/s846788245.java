import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    HashMap<Integer,Integer> freq = new HashMap<Integer, Integer>();
    int n;
    n = scanner.nextInt();
  	int x;
    long sum = 0;
    for(int i = 0;i < n; i++) {
      x = scanner.nextInt();
      sum+=x;
      if(freq.containsKey(x)) {
        freq.replace(x,freq.get(x) + 1);
      } else {
        freq.put(x,1);
      }
    }
    
    int q;
    q = scanner.nextInt();
    int b,c;
    for(int i = 0;i < q;i++) {
      b = scanner.nextInt();
      c = scanner.nextInt();
      if(freq.containsKey(b)) {
        int freq_b = freq.get(b);
        sum = sum - (long)b * freq_b + (long)c * freq_b;
        System.out.println(sum);
        freq.remove(b,freq_b);
        if(freq.containsKey(c)) {
          freq.replace(c,freq.get(c) + freq_b);
        } else {
          freq.put(c,freq_b);
        }
      } else {
        System.out.println(sum);
    }
    }
  }
}