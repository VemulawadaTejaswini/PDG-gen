import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
  public static void main(String[] arigs) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String N = reader.readLine();
    if(N.contains("7")){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    reader.close();
  }
}