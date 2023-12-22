import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    int a = Integer.parseInt(data[0]);
    int b = Integer.parseInt(data[1]);
    
    if (a%3 != 0 && b%3 != 0 && (a+b)%3 != 0){
      System.out.println("Impossible");
    } else {
      System.out.println("Possible");
    }
  }
}
