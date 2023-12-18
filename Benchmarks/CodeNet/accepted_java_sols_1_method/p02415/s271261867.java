import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String upper = line.toUpperCase();
        String lower = line.toLowerCase();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == upper.charAt(i)) {
                System.out.print(lower.charAt(i));
            } else {
                System.out.print(upper.charAt(i));
            }
        }
        System.out.println("");
        scanner.close();
    }
}

