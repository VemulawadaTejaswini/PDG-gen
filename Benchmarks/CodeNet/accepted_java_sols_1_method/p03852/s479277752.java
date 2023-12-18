import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String name1 = scan.next();
      String name2 = "aiueo";
        if(name2.contains(name1)){
          System.out.println("vowel");
        }
        else {
          System.out.println("consonant");
        }
    }
}