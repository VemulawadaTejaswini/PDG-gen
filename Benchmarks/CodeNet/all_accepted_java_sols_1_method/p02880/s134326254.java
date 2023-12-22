import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    for (int i=1; i<10; i++){
      for (int j=1; j<10; j++){
        if (i*j == n) {
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
}
