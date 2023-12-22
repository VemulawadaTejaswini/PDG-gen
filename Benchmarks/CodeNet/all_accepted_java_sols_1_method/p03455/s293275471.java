import java.util.*;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = Integer.parseInt(sc.next());
            if (a % 2 == 0) {
                System.out.println("Even");
                return;
            }

            int b = Integer.parseInt(sc.next());
            if (b % 2 == 0) {
                System.out.println("Even");
                return;
            }

            System.out.println("Odd");
            return;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}