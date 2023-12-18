import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong(); scanner.nextLine();

        Set<String> strs = new HashSet<>();

        String first = scanner.nextLine();
        strs.add(first);

        char tail = first.charAt(first.length() - 1);

        String ans = "Yes";
        for(int i = 1; i < N; i++) {
            String str = scanner.nextLine();
            char h = str.charAt(0);
            char t = str.charAt(str.length() - 1);

            if(tail != h || strs.contains(str)) {
                ans = "No";
                break;
            }
            tail = t;
            strs.add(str);
        }

        scanner.close();

        System.out.println(ans);
    }
}
