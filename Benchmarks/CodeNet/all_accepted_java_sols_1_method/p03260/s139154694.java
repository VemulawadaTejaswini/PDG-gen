import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        if (a * b % 2 == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
