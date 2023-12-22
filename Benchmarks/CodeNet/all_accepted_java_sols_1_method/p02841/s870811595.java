import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int ignore = sc.nextInt();
        int m2 = sc.nextInt();
        System.out.println(m1 != m2 ? "1" : "0");
    }
}