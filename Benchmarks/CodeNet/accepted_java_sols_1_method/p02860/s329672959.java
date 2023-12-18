import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = Integer.parseInt(sc.next());
    String word = sc.next();

    if(word.length() % 2 == 0){

      if(word.substring(0,word.length()/2).equals(word.substring(word.length()/2, word.length())))
        System.out.println("Yes");
      else
        System.out.println("No");
    }else{
      System.out.println("No");
    }
  }
}