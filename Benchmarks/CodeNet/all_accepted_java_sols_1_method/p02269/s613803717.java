import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String command = scanner.next();
            switch (command) {
            case "insert":
                set.add(scanner.next());
                break;
            case "find":
                if (set.contains(scanner.next())) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
                break;
            }
        }
        scanner.close();
    }
}

