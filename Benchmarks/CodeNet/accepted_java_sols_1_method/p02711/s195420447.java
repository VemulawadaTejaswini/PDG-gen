import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

class Main{
  public static void main(String[] arigs) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    String N = reader.readLine();
    if(N.contains("7")){
      out.println("Yes");
    }else{
      out.println("No");
    }
    reader.close();
    out.flush();
  }
}