import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int value = 700;
    for (int i=0; i<3; i++) {
      if(S.charAt(i) == 'o') value += 100;
    }
    System.out.println(value); 
  }
}