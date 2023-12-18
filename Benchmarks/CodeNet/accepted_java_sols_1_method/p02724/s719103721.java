import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int x = Integer.parseInt(br.readLine());
    
    int result = 0;
    while (x >= 500){
      x -= 500;
      result += 1000;
    }
    while (x>= 5){
      x -= 5;
      result += 5;
    }
    System.out.println(result);
  }
}
