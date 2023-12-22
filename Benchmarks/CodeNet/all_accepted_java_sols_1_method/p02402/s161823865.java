import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] datas = new int[Integer.parseInt(reader.readLine())];
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    long sum = 0;
    int c = 0;
    for (String str : reader.readLine().split(" ")) {
      datas[c] = Integer.parseInt(str);
      c++;
    }
    for (int data : datas) {
      if (min > data)
        min = data;
      if (max < data)
        max = data;
      sum += data;
    }
    System.out.println(String.format("%d %d %d", min, max, sum));
  }

}