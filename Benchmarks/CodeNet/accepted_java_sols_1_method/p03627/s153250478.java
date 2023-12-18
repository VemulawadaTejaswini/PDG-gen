import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    String[] data = br.readLine().split(" ");
    long[] sticks = new long[n];
    
    for(int i=0; i<n; i++){
      sticks[i] = Long.parseLong(data[i]);
    }
    Arrays.sort(sticks);
    int j = n-1;
    long result = 1;
    int judge = 0;
    while (j>=1 && judge != 2){
      if (sticks[j] == sticks[j-1]) {
        result*=sticks[j];
        judge++;
        j--;
      }
      j--;
    }
    if (judge != 2){
      result = 0;
    }
    System.out.println(result);
  }
}
