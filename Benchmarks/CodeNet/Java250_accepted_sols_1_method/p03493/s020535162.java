import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String mask = "111";
        int count = 0;
        for (int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
            if (c=='1') count++;
        }
        System.out.println(count);
    }
}
