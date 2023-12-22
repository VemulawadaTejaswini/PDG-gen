import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number, count;
    number = Integer.parseInt(sc.next());
    if(number < 9) {
      count = number;
    } else if(number < 100) {
      count = 9;
    } else if(number < 999) {
      count = 9 + (number - 99);
    } else if(number < 10000) {
      count = 909;
    } else if(number < 99999) {
      count = 9 + 900 + (number - 9999);
    } else {
      count = 90909;
    }
    System.out.println(count);
  }
}
