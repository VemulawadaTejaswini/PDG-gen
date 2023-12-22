import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[26];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        while (scanner.hasNext()) {
            String s = scanner.next().toUpperCase();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if ('A' <= c && c <= 'Z') {
                    count[c - 'A']++;
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            char c = (char)('a' + i);
            System.out.println(""+c+" : "+count[i]);
        }
    }
}
