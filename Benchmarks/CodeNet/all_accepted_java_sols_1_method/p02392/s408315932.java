import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = new Integer(sc.next());
        int b = new Integer(sc.next());
        int c = sc.nextInt();
        if (a < b && b < c) {
          System.out.println("Yes");
        }else {
          System.out.println("No");
        }
    }
}