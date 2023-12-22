import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Integer> ch = new HashSet<Integer>();
        for (int i = 0; i < s.length(); i++) {
            ch.add((int) s.charAt(i));
        }
        System.out.println(ch.size() == 2 ? "Yes" : "No");
    }
}
