import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            sb.append(s.charAt(i));
            if (i == 3) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
        // output
    }
}
