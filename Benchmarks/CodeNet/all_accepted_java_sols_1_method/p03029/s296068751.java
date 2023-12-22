import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    int a = Integer.parseInt(data[0]);
    int p = Integer.parseInt(data[1]);
    
    p += a*3;
    
    System.out.println(p/2);
  }
}