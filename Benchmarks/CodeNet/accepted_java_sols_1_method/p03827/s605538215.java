import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = sc.next().split("");
        int x = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if ("D".equals(s[i])) {
                x--;
                continue;
            }
            x++;
            if (x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }

}
