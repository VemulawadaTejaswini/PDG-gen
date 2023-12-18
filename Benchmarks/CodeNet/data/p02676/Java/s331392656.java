import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
      String k = scan.next();
      String s = scan.next();
      if (k.length()<=s.length()){
        System.out.println(k);
      }
      else{
        for (int i=0;i<s.length();i++){
          System.out.print(k.charAt(i));
        }
        System.out.println("...");
      }

  }
}
