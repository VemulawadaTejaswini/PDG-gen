/* ITP1_9_C */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int taro = 0, hanaco = 0;

      for(int i = 0; i < n; i++){
        String[] str = br.readLine().split(" ");
        String taro_card = str[0];
        String hanaco_card = str[1];
        int comp = taro_card.compareTo(hanaco_card);

        if(comp > 0) taro += 3;
        else if(comp < 0 ) hanaco += 3;
        else if(comp == 0){
          taro++;
          hanaco++;
        }
      }
      System.out.println(taro + " " + hanaco);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}