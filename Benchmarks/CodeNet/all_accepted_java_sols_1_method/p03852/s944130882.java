import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      String c = scan.next();
      if (c.equals("a")||c.equals("i")||c.equals("u")||c.equals("e")||c.equals("o")){
        System.out.println("vowel");
      }else{
        System.out.println("consonant");
      }
    }
}