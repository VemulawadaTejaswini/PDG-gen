import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] str = line.split("");
    StringBuilder editor = new StringBuilder();
    for(String s: str)
    {
      switch(s)
      {
        case "0":
          editor.append("0");
          break;
        case "1":
          editor.append("1");
          break;
        case "B":
          if(editor.length() > 0)
            editor.deleteCharAt(editor.length()-1);
          break;
      }
    }
    System.out.println(editor.toString());
  }

}