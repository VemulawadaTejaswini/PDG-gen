import java.util.*;
import java.text.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    Date date, heisei;
    try{
      date = sdf.parse(str);
      heisei = sdf.parse("2019/04/30");
      System.out.println((date.compareTo(heisei) <= 0) ? "Heisei" : "TBD");
    }catch(Exception e){
      
    }
  }
}