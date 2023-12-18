import java.io.*;
 
public class Main {
  public Main() {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      System.out.println(str.replace("apple", "xxxxx").replace("peach", "apple").replace("xxxxx", "peach"));
      br.close();
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }
  }
 
  public static void main(String[] args) {
    new Main();
  }
}