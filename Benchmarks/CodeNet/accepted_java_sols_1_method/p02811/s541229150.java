import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        sc.close();

        if (500 * k >= x) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
}