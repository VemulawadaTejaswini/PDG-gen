/* Volume2 */
import java.io.*;

class Main
{
  final static int[] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE };

  public static int stringSize(int x){
    for(int i=0; ; i++){
      if(x <= sizeTable[i]) return i+1;
    }
  }

  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      String str = "";

      while((str = br.readLine()) != null){
        String[] input = str.split(" ");
        int sum = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
        sb.append(stringSize(sum)).append("\n");
      }
      System.out.print(sb);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}