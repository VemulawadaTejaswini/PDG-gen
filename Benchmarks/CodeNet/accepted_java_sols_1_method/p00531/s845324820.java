import java.util.*;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xUnit = sc.nextInt();
        int base = sc.nextInt();
        int limit = sc.nextInt();
        int yUnit = sc.nextInt();
        int used = sc.nextInt();
        System.out.println(Math.min(used * xUnit, base + Math.max(used - limit, 0) * yUnit));
    }
}
