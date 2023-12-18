import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String val = scan.next();
    
    
    if(val.equals("a")|| val.equals("i")|| val.equals("u")|| val.equals("e")|| val.equals("o")){
      System.out.print("vowel");
    }else{
      System.out.print("consonant");
    }
    
  }
}
