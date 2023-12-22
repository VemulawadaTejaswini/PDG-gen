import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int count = 0;
    
    if (0 < n && n < 10) {
      count = n;
    } else if (n < 100) {
      count = 9;
    } else if (n < 1000) {
      count = 9 + n - 99;
    } else if (n < 10000) {
      count = 909;
    } else if (n < 100000) {
      count = 9 + 900 + n - 9999;
    } else if (n < 1000000) {
      count = 90909;
    }
    System.out.println(count);
  }
}