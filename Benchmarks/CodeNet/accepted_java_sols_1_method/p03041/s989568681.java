import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String[] s = sc.next().split("");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            if (i == k - 1) {
                sb.append(s[i].toLowerCase());
            } else {
                sb.append(s[i]);
            }
        }

        System.out.println(sb.toString());
    }
}