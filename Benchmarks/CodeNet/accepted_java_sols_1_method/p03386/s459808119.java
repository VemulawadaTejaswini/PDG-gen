import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.next());
        int end = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        for (int i = start; i <= end; i++) {
            if (i < start + n || i > end - n) {
                System.out.println(i);
            }
        }
    }
}
