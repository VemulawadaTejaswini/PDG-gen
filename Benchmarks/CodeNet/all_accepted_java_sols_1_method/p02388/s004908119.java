import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    double x = Double.parseDouble(str);
    double result = Math.pow(x, 3.0);
    System.out.println((int)result);
  }
}