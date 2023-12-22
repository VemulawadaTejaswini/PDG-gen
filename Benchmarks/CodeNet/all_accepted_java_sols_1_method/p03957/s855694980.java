import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean foundC = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!foundC && c != 'C') {
                continue;
            }
            foundC = true;
            if (c == 'F') {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

}
