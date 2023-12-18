import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("");
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("1")) {
                a[i] = "9";
            } else {
                a[i] = "1";
            }
            System.out.print(a[i]);
        }
    }
}
