import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    
    int n = Integer.parseInt(data[0]);
    int k = Integer.parseInt(data[1]);
    int result = 1;
    
    for(int i=0; i<n; i++){
      if (i == 0){
        result *= k;
      } else {
        result *= k-1;
      }
    }
    System.out.println(result);
  }
}
