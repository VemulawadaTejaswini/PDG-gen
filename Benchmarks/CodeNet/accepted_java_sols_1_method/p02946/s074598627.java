import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int start = x - (k - 1);
        int end = x + (k - 1);
        for (int i = start; i <= end; i++) {
            if (i != end) {
                System.out.print(i + " ");
            } else {
                System.out.println(i);
            }
        }
    }
}
