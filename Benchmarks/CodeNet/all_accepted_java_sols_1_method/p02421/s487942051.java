/* ITP1_9_C */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      int n = Integer.parseInt(br.readLine());
      int taro = 0;
      int hanaco = 0;

      for(int i = 0; i < n; i++){
        String[] str = br.readLine().split(" ");
        String taro_card = str[0];
        String hanaco_card = str[1];

        if(taro_card.compareTo(hanaco_card) > 0) taro += 3;
        else if(taro_card.compareTo(hanaco_card) < 0 ) hanaco += 3;
        else if(taro_card.equals(hanaco_card)){
          taro++;
          hanaco++;
        }
      }
      sb.append(taro).append(" ").append(hanaco);
      System.out.println(sb);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}