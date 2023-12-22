import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = s.substring(5,7);
    //System.out.println(t);
    if(t.compareTo("04")<=0){
      System.out.println("Heisei");
    }else{
      System.out.println("TBD");
    }
  }
}
