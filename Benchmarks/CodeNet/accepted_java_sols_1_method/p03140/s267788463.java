import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int count = 0;
        for (int i = 0 ; i < n ; i++) {
            Set<String> set = new HashSet<>();
            set.add(a.substring(i, i+1));
            set.add(b.substring(i, i+1));
            set.add(c.substring(i, i+1));
            count += set.size() - 1;
        }
        System.out.println(count);
    }

}