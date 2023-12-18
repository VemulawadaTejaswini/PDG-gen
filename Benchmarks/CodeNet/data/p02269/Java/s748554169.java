import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<String> dict = new HashSet<>();

        for(int i = 0; i < n; i++) {
            String cmd = sc.next();
            switch(cmd) {
                case "insert":
                dict.add(sc.next());
                break;
                case "find":
                if(dict.contains(sc.next())) {
                    System.out.println("yes");
                }else {
                    System.out.println("no");
                }
            }
        }

        sc.close();
    }
}
