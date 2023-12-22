import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_n = Integer.parseInt(sc.next());
    int number_k = Integer.parseInt(sc.next());
    String str = sc.next();
    if(number_k == 1) str = str.substring(0, 1).toLowerCase() + str.substring(1);
    else str = str.substring(0, number_k - 1) + str.substring(number_k - 1, number_k).toLowerCase() + str.substring(number_k);
    System.out.println(str);
  }
}
