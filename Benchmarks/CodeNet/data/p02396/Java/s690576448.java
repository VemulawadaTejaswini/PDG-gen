import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
  public static void main(String[] args){
    for(int i = 0; i < 10; i++){
      try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (Integer.parseInt(str) == 0){
          break;
        }
        System.out.println("Case " + i + ":" + Integer.parseInt(str));
      } catch (IOException e){
        System.out.println(e.toString());
      }
    }
  }
}
