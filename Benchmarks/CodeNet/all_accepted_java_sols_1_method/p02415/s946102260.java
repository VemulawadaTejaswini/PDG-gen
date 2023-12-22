import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                System.out.print((char)(s.charAt(i) - 'a' + 'A'));
            } else if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                System.out.print((char)(s.charAt(i) - 'A' + 'a'));
            }
            else System.out.print(s.charAt(i));
        }
        System.out.print("\n");
    }
}
