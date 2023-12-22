import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
  public static void main(String[] arigs) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String N = reader.readLine();
    System.out.println(N.contains("7")?"Yes":"No");
    reader.close();
  }
}