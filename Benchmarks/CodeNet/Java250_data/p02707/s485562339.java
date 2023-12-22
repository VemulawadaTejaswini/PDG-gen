import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] a = new int[n-1];
    String[] str = in.readLine().split(" ");
    in.close();
    int[] boss = new int[n];
    for(int i=0; i<n-1; i++) {
      a[i] = Integer.parseInt(str[i]); 
      boss[a[i]-1]++;
    }
    PrintWriter pw = new PrintWriter(System.out);
    for(int i=0; i<n; i++) {
      pw.println(boss[i]);
    }
    pw.flush();
  }
}