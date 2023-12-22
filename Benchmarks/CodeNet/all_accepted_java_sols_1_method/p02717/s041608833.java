import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int x = Integer.parseInt(str[0]);
    int y = Integer.parseInt(str[1]);
    int z = Integer.parseInt(str[2]);
    
    int tempX = x;
    x = z;
    int tempY = y;
    y = tempX;
    z = tempY;
    
    System.out.println(x + " " + y + " " + z);
  }
}
