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
      String str = "";

      while((str = br.readLine()) != null){
        str = str.toLowerCase();

        for(char c : str.toCharArray()){
          if(Character.isLetter(c))
            count[c - 'a']++;
        }
      }

      for(int i = 0; i < count.length; i++){
        System.out.println((char)('a' + i) + " : " + count[i]);
      }
    }catch(Exception e){
      System.out.println(e);
    }
  }
}