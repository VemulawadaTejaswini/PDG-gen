/* ITP1_9_B */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String cards = "";

      while((cards = br.readLine()).equals("-") == false){
        int shuffle = Integer.parseInt(br.readLine());

        for(int i = 0; i < shuffle; i++){
          int h = Integer.parseInt(br.readLine());
          StringBuilder sb = new StringBuilder();
          sb.append(cards.substring(h, cards.length()));
          sb.append(cards.substring(0, h));
          cards = sb.toString();
        }
        System.out.println(cards);
      }

    }catch(Exception e){
      System.out.println(e);
    }
  }
}