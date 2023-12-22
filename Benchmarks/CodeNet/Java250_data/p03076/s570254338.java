import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] price = new int[5];
    for (int i = 0; i < 5; i++) {
      price[i] = Integer.parseInt(br.readLine());
    }
    
    int sum = 0;
    HashMap<Integer, Integer> tmp = new HashMap<Integer, Integer>();
    for (int i = 0; i < 5; i++) {
      if (price[i] % 10 == 0) {
        sum += price[i];
      } else {
        sum += price[i] + (10 - price[i] % 10);
        tmp.put(i, 10 - price[i] % 10);
      }
    }
    
    int max = 0;
    for (Map.Entry<Integer, Integer> entry : tmp.entrySet()) {
      max = Math.max(max, entry.getValue());
    }
    System.out.println(sum - max);
  }
}