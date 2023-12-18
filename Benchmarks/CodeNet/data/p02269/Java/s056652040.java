import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> dic = new HashSet<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String command = scanner.next();
            String str = scanner.next();
            switch (command) {
                case "add":
                    dic.add(str);
                    break;
                case "remove":
                    dic.remove(str);
                    break;
                case "find":
                    if (dic.contains(str)) {
                        System.out.println("yes");
                    } else {
                        System.out.println("no");
                    }
                    break;
            }
        }
    }
}