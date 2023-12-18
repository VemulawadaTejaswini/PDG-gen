import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String c = scanner.next();
    if(c.equals("a") || c.equals("e")|| c.equals("i")|| c.equals("o")|| c.equals("u")){
      System.out.println("vowel");
    }else{
      System.out.println("consonant");
    }
  }
}
