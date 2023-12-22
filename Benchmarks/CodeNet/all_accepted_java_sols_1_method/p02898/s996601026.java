import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int k = Integer.parseInt(str[1]);
    String[] h_str = in.readLine().split(" ");
    int[] h = new int[n];
    int count = 0;
    
    for(int i = 0; i < n; i++) {
      h[i] = Integer.parseInt(h_str[i]);
      if(h[i]>=k)
        count+=1;
    }
    System.out.println(count);
  }
}