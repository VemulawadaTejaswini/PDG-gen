import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
      int k = scan.nextInt();
      String s = scan.next();
      if (k>=s.length()){
        System.out.println(s);
      }
      else{
        for (int i=0;i<k;i++){
          System.out.print(s.charAt(i));
        }
        System.out.println("...");
      }

  }
}
