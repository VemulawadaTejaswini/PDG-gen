/* ITP1_9_A */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String w = br.readLine();
      String t;
      int count = 0;

      while((t = br.readLine()).equals("END_OF_TEXT") == false){

        String[] word = t.split(" ");
        for(String str : word){
          if(str.equalsIgnoreCase(w)) count++;
        }
      }
      System.out.println(count);

    }catch(Exception e){
      System.out.println(e);
    }
  }
}