import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n =Integer.parseInt(in.readLine());
    String[] d = new String[n];
    HashSet hs = new HashSet();
    for(int i=0; i<n; i++) {
      d[i] = in.readLine();
      hs.add(d[i]);
    }
    System.out.println(hs.size());
  }
}