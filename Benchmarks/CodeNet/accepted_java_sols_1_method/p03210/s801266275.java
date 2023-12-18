import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        if (a == 3 || a == 5 || a == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
