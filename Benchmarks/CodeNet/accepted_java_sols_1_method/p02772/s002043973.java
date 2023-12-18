
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        long size = Long.parseLong(values[0]);
        values = scanner.nextLine().split(" ");
        for (int i = 0; i < size; i++) {
            String value = values[i];
            long v = Long.parseLong(value);
            if (v % 2 == 0) {
                if (v % 3 == 0 || v % 5 == 0) {
                    continue;
                } else {
                    System.out.println("DENIED");
                    return;
                }
            }
        }
        System.out.println("APPROVED");
    }
}