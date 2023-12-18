/* ITP1_8_C */
import java.io.*;

class Main
{
  static final int ALPHABET = 26;

  public static void main(String[] args)
  {
    int[] count = new int[ALPHABET];
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      String str = "";

      while((str = br.readLine()) != null){
        str = str.toLowerCase();

        for(char c : str.toCharArray()){
          if(Character.isLetter(c))
            count[c - 'a']++;
        }
      }

      for(int i = 0; i < count.length; i++){
        sb.append((char)('a' + i));
        sb.append(" : ").append(count[i]).append("\n");
      }
      System.out.print(sb);

    }catch(Exception e){
      System.out.println(e);
    }
  }
}