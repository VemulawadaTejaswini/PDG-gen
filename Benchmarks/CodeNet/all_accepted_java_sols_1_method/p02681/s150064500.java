import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    for (int j = 0; j<a.length();j++){
      if (a.charAt(j)!=b.charAt(j)){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}
