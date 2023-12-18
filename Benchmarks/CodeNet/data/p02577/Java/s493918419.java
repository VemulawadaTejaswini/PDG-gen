import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if (n%9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}