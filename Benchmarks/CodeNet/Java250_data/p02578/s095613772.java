import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] data = br.readLine().split(" ");
    long[] a = new long[n];
    for(int i = 0; i < n; i++){
      a[i] = Long.parseLong(data[i]);
    }
    long answer = 0;
    long max = a[0];
    for(int i = 1; i < n; i++){
      max = Math.max(max, a[i]);
      answer += Math.abs(max - a[i]);
    }
    System.out.println(answer);
  }
}