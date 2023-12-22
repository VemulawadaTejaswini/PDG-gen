import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    int i = 1;
    do {
      System.out.println("Case "+i+": "+line);
      line = br.readLine();
      i++;
    } while (!(line.equals("0")));
  }
}