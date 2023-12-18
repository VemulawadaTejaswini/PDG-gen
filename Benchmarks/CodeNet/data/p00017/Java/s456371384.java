import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(sc.hasNextLine()){
      String s = sc.nextLine();

      for(int i = 0; i < 26; i++){
        if(s.contains("this") || s.contains("that") || s.contains("the")){
          System.out.println(s);
          break;
        }

        String ns = "";

        for(int j = 0; j < s.length(); j++){
          char ch = s.charAt(j);
          if('a' <= ch && ch <= 'z'){
            ch = (char)((ch - 'a' + 1) % 26 + 'a');
          }
          ns += ch;
        }

        s = ns;
      }
    }
  }
}