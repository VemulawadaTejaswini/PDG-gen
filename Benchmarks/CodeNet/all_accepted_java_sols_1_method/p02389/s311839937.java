import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    int x = Integer.parseInt(line[0]);
    int y = Integer.parseInt(line[1]);
    System.out.println(x*y+" "+(x+y)*2);
  }
}