/* ITP1_8_B */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    int sum = 0;

    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      String str = "";

      while((str = br.readLine()).equals("0") == false){
        char[] input = str.toCharArray();
        sum = 0;

        for(int i = 0; i < input.length; i++){
          sum += Character.getNumericValue(input[i]);
        }
        sb.append(sum).append("\n");
      }
      System.out.print(sb);

    }catch(Exception e){
      System.out.println(e);
    }
  }
}