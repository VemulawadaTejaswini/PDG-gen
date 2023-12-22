import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    char[] n = br.readLine().toCharArray();
    
    for (int i=0; i<n.length; i++){
      if (n[i] != n[n.length-1-i]){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}