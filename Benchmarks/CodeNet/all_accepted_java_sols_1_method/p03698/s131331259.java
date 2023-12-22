import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str;
        str = s.split("");
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (str[i].equals(str[j])) {
                    System.out.println("no");
                    System.exit(0);
                }
            }
        }
        System.out.println("yes");
    }
}
