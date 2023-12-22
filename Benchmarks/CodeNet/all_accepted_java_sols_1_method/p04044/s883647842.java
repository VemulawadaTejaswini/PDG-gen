import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException{
    String[] strs;
    String[] list = null;
    try(BufferedReader br 
        = new BufferedReader(new InputStreamReader(System.in))
    ){
      strs = br.readLine().split(" ");
      int N = Integer.parseInt(strs[0]);
      list = new String[N];
      for (int i = 0; i < N; i++) {
        list[i] = br.readLine();
      }
    }
    
    Arrays.sort(list);
    
    for (String s : list) {
      System.out.print(s);
    }
  }
}