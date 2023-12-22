import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        if(s.length == 1) {
            System.out.println(0);
            return;
        }
        int zero = 0;
        int one = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i] == '0' && i % 2 == 0) {
                zero++;
            } else if(s[i] == '1' && i % 2 == 0) {
                one++;
            } else if(s[i] == '0' && i % 2 == 1) {
                one++;
            } else if(s[i] == '1' && i % 2 == 1) {
                zero++;
            } else {
                System.out.println(0);
                return;
            }
        }
        zero = s.length - zero;
        one = s.length - one;
        System.out.println(Math.min(zero, one));

    }
}