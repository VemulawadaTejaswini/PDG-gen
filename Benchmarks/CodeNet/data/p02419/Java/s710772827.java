import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    int count=0;
    while(true)
    {
      String s = sc.next();
      if(s.equals("END_OF_TEXT")) break;
      if(word.equals(s.toLowerCase()))
      {
        count++;
      }
    }
    out.println(count);
  }
}
