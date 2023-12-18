import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dist = sc.nextDouble();
        double speed = sc.nextDouble();
        double time = sc.nextDouble();
        if (dist / speed < time) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}