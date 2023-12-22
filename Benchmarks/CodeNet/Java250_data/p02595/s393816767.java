import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line1 = br.readLine().split(" ");
    int n = Integer.parseInt(line1[0]);
    long d = Long.parseLong(line1[1]);
    long d2 = d * d;
    int answer = 0;
    for(int i = 0; i < n; i++){
      String[] line2 = br.readLine().split(" ");
      long x = Long.parseLong(line2[0]);
      long y = Long.parseLong(line2[1]);
      long distance2 = (x * x) + (y * y);
      if(d2 >= distance2) answer++;
    }
    System.out.println(answer);
  }
}