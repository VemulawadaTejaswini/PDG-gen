import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> dictionary = new HashSet<String>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String command = scanner.next();
            if (command.equals("insert")) {
                String word = scanner.next();
                dictionary.add(word);
            } else if (command.equals("find")) {
                String word = scanner.next();
                System.out.println(dictionary.contains(word) ? "yes" : "no");
            }
        }
        scanner.close();
    }
}

