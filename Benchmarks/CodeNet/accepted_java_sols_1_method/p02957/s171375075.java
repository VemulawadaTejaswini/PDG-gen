import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    int a = Integer.parseInt(line[0]);
    int b = Integer.parseInt(line[1]);
    if( (a+b)%2 == 1 )
      System.out.println("IMPOSSIBLE");
    else
      System.out.println((a+b)/2);
  }
}
