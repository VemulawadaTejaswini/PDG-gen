import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();

    int counter = 0;
    for(int i=0; i<s.length(); i++){
      if(s.charAt(i) != t.charAt(i)) counter++;
    }
    
    System.out.println(counter);

  }
}