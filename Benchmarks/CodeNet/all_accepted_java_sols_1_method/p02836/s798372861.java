import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // B - Palindrome-philia

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        
        char[] cs = s.toCharArray();
        
        int count = 0;
        for (int i = 0; i < cs.length / 2; i++) {
            if (cs[i] != cs[cs.length - i -1]) {
                ++count;
            }
        }
        System.out.println(count);
    }
}