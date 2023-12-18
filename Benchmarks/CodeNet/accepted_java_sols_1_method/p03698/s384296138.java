import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<String> set = new HashSet<>();
        for (int i = 0 ; i < s.length() ; i++) {
            set.add(s.substring(i, i+1));
        }
        System.out.println(set.size() == s.length() ? "yes" : "no");
    }

}