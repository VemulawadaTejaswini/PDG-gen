/* ITP1_8_B */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      while(true){
        String str = br.readLine();
        char[] input = str.toCharArray();
        if(input[0] == '0') break;

        int sum = 0;
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