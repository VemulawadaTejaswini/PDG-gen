import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    Set s = new HashSet<String>();
    String[] str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      s.add(str[i]);
    }
    System.out.println(s.size()==4?"Four":"Three");
  }
}