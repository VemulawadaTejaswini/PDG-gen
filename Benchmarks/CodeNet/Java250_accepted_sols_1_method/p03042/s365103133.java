import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int begin =Integer.parseInt(s.charAt(0)+""+s.charAt(1));
    int end = Integer.parseInt(s.charAt(2)+""+s.charAt(3));
    if((begin > 12 || begin == 0) && (end <= 12 && end != 0)){
      System.out.println("YYMM");
    } else if((begin <= 12 && begin !=0) && (end > 12 || end == 0)){
      System.out.println("MMYY");
    } else if((begin <= 12 && begin != 0) && (end <= 12 && end !=0)){
      System.out.println("AMBIGUOUS");
    } else {
      System.out.println("NA");
    }
  }
}