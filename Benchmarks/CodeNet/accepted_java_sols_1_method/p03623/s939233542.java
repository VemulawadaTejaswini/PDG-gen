import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int distanceXA = Math.abs(a - x);
        int distanceXB = Math.abs(b - x);

        if (distanceXA < distanceXB) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
