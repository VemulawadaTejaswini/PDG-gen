import java.io.*;

public class Main {
  public static void main(String... args) {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));

    try {
      String s = br.readLine();
      if(s.equals("Sunny")) {
        System.out.println("Cloudy");
      } else if(s.equals("Cloudy")) {
        System.out.println("Rainy");
      } else {
        System.out.println("Sunny");
      }
      br.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}