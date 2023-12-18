import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.nextLine();
        for (int i = 0; i < a; i++) {
            String cache = sc.nextLine();
            for (int j = 0; j < 2; j++) {
                System.out.println(cache);
            }
        }
    }
}