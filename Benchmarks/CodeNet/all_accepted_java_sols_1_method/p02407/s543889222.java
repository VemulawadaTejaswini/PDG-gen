import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] strArray = br.readLine().split(" ");
    String[] strArray2 = new String[n];
    for(int i = 0;i < n;i++) {
      strArray2[i] = strArray[n-i-1];
    }
    for(int i = 0;i < (n-1);i++) {
      System.out.print(strArray2[i] + " ");
    }
    System.out.println(strArray2[n-1]);
  }
}