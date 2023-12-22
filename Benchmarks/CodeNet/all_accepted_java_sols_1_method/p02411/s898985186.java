import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            
            if (a == -1 && b == -1 && c == -1) {
                return;
            }
            
            if (a == -1 || b == -1) {
                System.out.println("F");
            } else if (a + b >= 80) {
                System.out.println("A");
            } else if (a + b < 80 && a + b >= 65) {
                System.out.println("B");
            } else if (a + b < 65 && a + b >= 50) {
                System.out.println("C");
            } else if (a + b < 50 && a + b >= 30) {
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

