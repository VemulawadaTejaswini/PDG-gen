import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String ans = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '1') {
        ans += "9";
      } else if (str.charAt(i) == '9') {
        ans += "1";
      }
    }
    System.out.println(ans);
  }
}