import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String s = sc.next();
        String abc = "ABC";
        int res = 0;
        int pos = s.indexOf(abc, 0);
        while (pos >= 0) {
            res += 1;
            pos = s.indexOf(abc, pos + 1);
        }
        System.out.println(res);
    }
}