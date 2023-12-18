import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
 
class ITP1_1_D
{
  public static void main(String[] args) throws IOException {
    BufferedReader buf;
    buf = new BufferedReader(new InputStreamReader(System.in));
    int S = Integer.parseInt(buf.readLine());
    int h = S / 3600;
    int tmp = S - (h * 3600);
    System.out.println(h+":"+(tmp/60)+":"+(tmp-(tmp/60)*60));
  }
}