import java.util.*;
import java.lang.String;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt(); 
    sc.nextLine();
    String str = sc.nextLine(); // 6 7 9 10 31
    
    String[] arr = str.split(" ");
    for (String a : arr) {
      int i = Integer.parseInt(a);
      if (i % 2 == 0 && (i % 3 != 0 && i%5 != 0)) {
          System.out.println("DENIED");
          return;
      }
    }
    System.out.println("APPROVED");
  }
}