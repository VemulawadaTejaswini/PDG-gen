import java.io.*;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    int iNum = Integer.parseInt(line);
    int h = iNum / 3600;
    int m = (iNum % 3600) / 60;
    int s = (iNum % 3600) % 60;
    System.out.println(h + ":" + m + ":" + s);
  }
}