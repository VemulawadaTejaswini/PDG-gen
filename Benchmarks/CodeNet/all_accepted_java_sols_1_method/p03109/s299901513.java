import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    String year = S.substring(0, 4);
    String month = S.substring(5, 7);
    String day = S.substring(8);
    
    int yearInt = Integer.parseInt(year);
    int monthInt = Integer.parseInt(month);
    int dayInt = Integer.parseInt(day);
    
    if (yearInt <= 2018) {
      System.out.println("Heisei");
    } else if (yearInt == 2019 && monthInt <= 4) {
      System.out.println("Heisei");
    } else {
      System.out.println("TBD");
    }
  }
}