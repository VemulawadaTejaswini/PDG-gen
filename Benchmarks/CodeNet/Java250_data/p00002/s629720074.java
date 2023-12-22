import java.io.*;
class Main {
  public static void main(String... args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    while(s != null) {
      String[] arr = s.split(" ");
      int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
      System.out.println((int)Math.log10(sum)+1);
      s = br.readLine();
    }
  }
}