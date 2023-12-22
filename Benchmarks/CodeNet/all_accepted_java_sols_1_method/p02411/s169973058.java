import java.util.*;

public class Main {
    public static  void main(String  args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a < 0 && b < 0 && c < 0) break;
            if (a < 0 || b < 0) {
                System.out.println("F");
            } else {
                int s = a + b;
                if (s >= 80) {
                    System.out.println("A");
                } else if (s >= 65) {
                    System.out.println("B");
                } else if (s >= 50) {
                    System.out.println("C");
                } else if (s >= 30) {
                    if (c >= 50) {
                        System.out.println("C");
                    } else {
                        System.out.println("D");
                    }
                } else {
                    System.out.println("F");
                }
            }
        }

    }
}