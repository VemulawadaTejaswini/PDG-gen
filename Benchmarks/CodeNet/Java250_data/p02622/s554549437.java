import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            char c = s.charAt(i);
            char d = t.charAt(i);
            if(c != d) {
                count++;
            }
        }
        System.out.println(count);
    }
}