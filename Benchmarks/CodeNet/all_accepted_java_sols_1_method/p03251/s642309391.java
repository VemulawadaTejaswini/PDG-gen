import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int a_max = Integer.MIN_VALUE;
        int b_min = Integer.MAX_VALUE;
        for (int i = 0; i < a; i++) {
            a_max = Math.max(a_max,Integer.parseInt(sc.next()));
        }
        for (int i = 0; i < b; i++) {
            b_min = Math.min(b_min,Integer.parseInt(sc.next()));
        }
        int z = a_max + 1;
        if (z > A && z <= B) {
            if (z <= b_min) {
                System.out.println("No War");
                return;
            }
        }
        System.out.println("War");
    }
}
