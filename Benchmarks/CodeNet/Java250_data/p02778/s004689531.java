import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        String input = values[0];
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            s.append("x");
        }
        System.out.println(s.toString());
    }
}