import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    List<String> day = Arrays.asList("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT");
    System.out.println(7 - day.indexOf(s));
  }
}
