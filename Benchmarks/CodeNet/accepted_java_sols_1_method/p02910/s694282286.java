import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ary = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) % 2 == 0) {
                if (ary[i] == 'R') {
                    System.out.println("No");
                    return;
                }
            } else {
                if (ary[i] == 'L') {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}