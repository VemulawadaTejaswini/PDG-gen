import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            if (a == 0 && b == 0) break;
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (j != b - 1) {
                        System.out.print("#");
                    } else {
                        System.out.println("#");
                    }
                }
            }
            System.out.println();
        }
    }
}
