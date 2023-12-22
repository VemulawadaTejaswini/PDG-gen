import java.util.*;
public class Main{
  public static void main(String[] args) {

    Scanner ob = new Scanner(System.in);
    String S = ob.next();
    String result = "";

    if(S.equals("ABC")){
      result += "ARC";
    }
    else{
      result += "ABC";
    }
    System.out.println(result);
  }
}
