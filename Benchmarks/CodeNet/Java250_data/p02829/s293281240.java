
import java.util.*;

public class Main {
    public static void main(String[] args) {

        solve_148_A();
      
        return;
    }

    private static void solve_148_A() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C;

        C = (6 - A - B);

        System.out.println(C);
    }
}