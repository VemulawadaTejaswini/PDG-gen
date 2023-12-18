/* ITP1_6_B */
import java.io.*;

class Main
{
  static final String[] SUIT = {"S", "H", "C", "D"};

  public static void main(String[] args)
  {
    boolean[][] cards = new boolean[4][13];

    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      int n = Integer.parseInt(br.readLine());
      if(n < 0 || n > 52) System.exit(-1);
      // check
      for(int i = 0; i < n; i++){
        String[] str = br.readLine().split(" ");
        String suit = str[0];
        int lank = Integer.parseInt(str[1]);

        if(suit.equals(SUIT[0])) cards[0][lank-1] = true;
        else if(suit.equals(SUIT[1])) cards[1][lank-1] = true;
        else if(suit.equals(SUIT[2])) cards[2][lank-1] = true;
        else if(suit.equals(SUIT[3])) cards[3][lank-1] = true;
        else
          System.exit(-1);
      }
      // output
      for(int i = 0; i < 4; i++){
        for(int j = 0; j < 13; j++){
          if(cards[i][j] != true) sb.append(SUIT[i] + " " + (j + 1) + "\n");
        }
      }
      System.out.print(sb);

    }catch(Exception e){
      System.out.println(e);
    }
  }
}