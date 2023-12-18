import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] data = br.readLine().split(" ");
    int d = Integer.parseInt(data[0]);
    int t = Integer.parseInt(data[1]);
    int s = Integer.parseInt(data[2]);
    br.close();
    System.out.println( s * t >= d ? "Yes" : "No");
  }
}