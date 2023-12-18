import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(in.next());
        int b = Integer.parseInt(in.next());
        if (a * b % 2 == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}