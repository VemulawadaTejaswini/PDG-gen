import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line1 = br.readLine().split(" ");
    int n = Integer.parseInt(line1[0]);
    int k = Integer.parseInt(line1[1]);
    
    String[] data = br.readLine().split(" ");
    int[] l = new int[n];
    for (int i=0; i<n; i++){
      l[i] = Integer.parseInt(data[i]);
    }
    Arrays.sort(l);
    int result = 0;
    for (int i=0; i<k; i++){
      result += l[l.length-i-1];
    }
    System.out.println(result);
  }
}
