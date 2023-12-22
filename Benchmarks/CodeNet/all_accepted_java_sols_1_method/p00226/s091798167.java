import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            char[] n = sc.next().toCharArray(), m = sc.next().toCharArray();
            if (n.length == 1 && m.length == 1 && (n[0] | m[0]) == '0') {
                break;
            }
            int hit = 0;
            int blow = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == j) {
                        if (n[i] == m[j]) {
                            hit++;
                        }
                    } else {
                        if (n[i] == m[j]) {
                            blow++;
                        }
                    }
                }
            }
            System.out.println(hit + " " + blow);
        }
    }
}
