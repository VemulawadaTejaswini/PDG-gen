import java.util.*;
public class Main {

  public static String S;
  public static String[] arr;

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    S = sc.next();
    sc.close();
    String[] arr_ = S.split("");

    String result = "Bad";

    if (!arr_[0].equals(arr_[1])) {
      
      if (!arr_[1].equals(arr_[2]))  {

        if (!arr_[2].equals(arr_[3]))  {
          result = "Good";
        }

      }

    }

    System.out.println(result);

  }
  
}