import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String alphabet = "";

    for( char c = 'a'; c <= 'z'; c++){
      alphabet += c;
    }

    if(alphabet.contains(str)){
      System.out.println("a");
    }else{
      System.out.println("A");
    }

    return;
  }
}