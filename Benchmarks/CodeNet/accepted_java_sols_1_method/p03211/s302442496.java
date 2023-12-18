import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = s.length() - 2;
        int abs = Integer.MAX_VALUE;
        for (int i = 0; i < cnt; i++) {
            int v = Integer.parseInt(s.substring(i, i + 3));
            int tmp = Math.abs(753 - v);
            if (abs > tmp) abs = tmp;
        }
        System.out.println(abs);
    }
}
