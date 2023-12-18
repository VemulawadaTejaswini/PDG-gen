import java.io.*;

public class Main{
  public static void main(String[] args){
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      try{
        String a = br.readLine();
        int X = Integer.parseInt(a);

        if(X >= 30){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }catch(IOException e){
      }catch(NumberFormatException e){
      }
  }
}