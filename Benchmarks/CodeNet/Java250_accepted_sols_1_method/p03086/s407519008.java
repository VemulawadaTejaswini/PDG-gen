import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    char[] t = br.readLine().toCharArray();
    
    int result = 0;
    int temp = 0;
    for (char c : t){
      if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
        temp++;
        if (result < temp) result = temp;
      } else {
        temp = 0;
      }
    }
    System.out.println(result);
  }
}