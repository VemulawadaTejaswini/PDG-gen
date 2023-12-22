import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            set.add(s[i]);
        }
        System.out.println(set.size());

    }

}
