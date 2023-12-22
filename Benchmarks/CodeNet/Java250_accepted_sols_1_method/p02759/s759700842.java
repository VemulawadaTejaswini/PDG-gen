import java.util.*;
class Main{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        if (n % 2 == 1) {
            n = n / 2 + 1;
        } else if (n % 2 == 0) {
            n = n / 2;
        }
        System.out.println(n);
    }
}