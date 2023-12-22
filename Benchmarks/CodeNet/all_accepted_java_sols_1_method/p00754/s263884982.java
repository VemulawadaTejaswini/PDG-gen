import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      String s = sc.nextLine();
      if(s.equals(".")) break;

      s = s.replaceAll("[a-zA-Z \\.]+","");

      while(!s.equals("")){
        String before = s;
        s = s.replaceAll("\\(\\)|\\[\\]","");
        if(before.equals(s)) break;
      }
      System.out.println(s.equals("") ? "yes" : "no");
    }
  }
}