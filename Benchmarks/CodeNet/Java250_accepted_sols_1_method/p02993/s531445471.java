import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == str.charAt(i-1)) {
        System.out.println("Bad");
        return;
      }
    }
    System.out.println("Good");
  }
}