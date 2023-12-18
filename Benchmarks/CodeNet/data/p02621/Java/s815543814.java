import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
 public static void main(String[] args) throws IOException {
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   int a = Integer.parseInt(reader.readLine());
   long result = a + a * a + a * a * a;
   System.out.println(result);
 }
}
