import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String s_year = s.substring(0,4);
    String date = s.substring(5,10);
    String year = "2018";

    System.out.println(year+"/"+date);

  }

}
