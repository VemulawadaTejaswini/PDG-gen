import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<String> dic = new HashSet<String>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String input = sc.next();

            if (input.equals("insert")) {
                dic.add(sc.next());
            }

            if (input.equals("find")) {
                if (dic.contains(sc.next())) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }

        sc.close();
    }
}

