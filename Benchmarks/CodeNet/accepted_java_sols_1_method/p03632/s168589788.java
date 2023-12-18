import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    
    int[] n = new int[4];
    
    for (int i=0; i<4; i++){
      n[i] = Integer.parseInt(data[i]);
    }
    
    int result = 0;
    if (n[0] < n[2]){
      if (n[1] < n[3]){
        result = Math.max(n[1] - n[2], 0);
      } else {
        result = n[3]-n[2];
      }
    } else {
      if (n[3] < n[1]){
        result = Math.max(n[3] -n[0], 0);
      } else {
        result = n[1]-n[0];
      }
    }
    System.out.println(result);
  }
}
