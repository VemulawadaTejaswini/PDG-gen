import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String sLast = s.substring(s.length() - 1);
    if(sLast.equals("s")){
      s = s+"es";
    }else{
      s = s+"s";
    }
    System.out.println(s);
  }
}