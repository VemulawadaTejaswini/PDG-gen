import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
  public static void main(String[] args){
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int x = Integer.parseInt(br.readLine());
      h = x/3600;
      m = (x%3600)/60;
      s = ((x%3600)%60);
      System.out.println(h + ":" + m + ":" + s);
    } catch(IOException e){
      System.err.println(e.toString());
    }
  }
}
