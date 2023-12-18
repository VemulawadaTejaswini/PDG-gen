import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[]args) throws IOException {
    BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
    String s;
    
    while ((s = b.readLine()) != null) {
      char[]a = s.toCharArray();
      for (int i = 0; i < a.length/2; i++) {
        swap(i, a.length-i-1, a);
      }
      System.out.println(String.valueOf(a));
    }
  }
  
  static void swap(int i, int j, char[]a) {
    char temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}