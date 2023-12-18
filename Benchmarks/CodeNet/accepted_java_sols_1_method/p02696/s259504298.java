import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        Double b = Double.parseDouble(sc.next());
        Double n = Double.parseDouble(sc.next());
        sc.close();
        if (n >= b - 1) {
            System.out.println((int) (a - a / b));
        } else {
            System.out.println((int) (a * n / b) - a * (int) (n / b));
        }
        System.out.println();
    }
}