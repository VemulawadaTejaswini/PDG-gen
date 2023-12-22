import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    int x = Integer.parseInt(data[0]);
    int y = Integer.parseInt(data[1]);
    int z = Integer.parseInt(data[2]);
    
    System.out.println(z + " " + x + " " + y);
  }
}