import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    Set<Integer> st = new HashSet<>();
    for(int i=0; i<n; i++) {
      st.add(Integer.parseInt(str[i]));
    }
    System.out.println(st.size() == n?"YES":"NO");
  }
}