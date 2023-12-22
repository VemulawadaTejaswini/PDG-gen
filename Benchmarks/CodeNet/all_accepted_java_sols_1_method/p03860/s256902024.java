import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[3];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next().substring(0, 1).toUpperCase();
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
}