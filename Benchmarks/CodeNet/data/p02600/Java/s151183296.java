import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    int ans = 0;
    if (n >= 400 && n <= 599) ans = 8;
    if (n >= 600 && n <= 799) ans = 7;
    if (n >= 800 && n <= 999) ans = 6;
    if (n >= 1000 && n <= 1199) ans = 5;
    if (n >= 1200 && n <= 1399) ans = 4;
    if (n >= 1400 && n <= 1599) ans = 3;
    if (n >= 1600 && n <= 1799) ans = 2;
    if (n >= 1800 && n <= 1999) ans = 1;

    out.println(ans);
    out.close();
  }
}