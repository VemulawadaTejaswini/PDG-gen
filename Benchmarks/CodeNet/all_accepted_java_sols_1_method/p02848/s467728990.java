import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < n; j++) {
                c++;
            }
            if (c > 90) {
                c -= 26;
            }
            sb.append(c);
        }
        sb.append("\n");
        System.out.println(sb.toString());
    }
}