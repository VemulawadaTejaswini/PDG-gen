import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long count = 0;
        for (char c : S.toCharArray()) {
            count += c-48;
            if (count%9 == 0) {
                count = 0;
            }
        }
        System.out.println(count == 0 ? "Yes" : "No");
    }
}