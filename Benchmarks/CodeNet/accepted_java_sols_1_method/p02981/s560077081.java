import java.util.*;


public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int train = n * a;
      if (train > b) {
        System.out.print(b);
      } else {
        System.out.print(train);
      }     
    }
}