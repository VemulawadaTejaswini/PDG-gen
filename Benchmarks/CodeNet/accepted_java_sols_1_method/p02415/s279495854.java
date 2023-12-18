import java.io.*;

public class Main{
  public static void main(String[] args){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String a;
    try{
      a = reader.readLine();
      char[] c = a.toCharArray();
      //System.out.printf("%s\n", a);
      for(char cs: c){
        //System.out.printf("%c\n", cs);
        if(Character.isLowerCase(cs)) System.out.printf("%c", Character.toUpperCase(cs));
        else if(Character.isUpperCase(cs)) System.out.printf("%c", Character.toLowerCase(cs));
        else System.out.printf("%c", cs);
      }
      System.out.printf("\n");
    }
    catch(IOException e) {
      //例外処理 たとえば数字以外のものが入力された時など
      System.out.println(e);
    }
  }
}
