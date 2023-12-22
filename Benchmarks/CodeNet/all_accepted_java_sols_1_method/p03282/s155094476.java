import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = sc.nextLong();
        int index = -1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '1') {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println(1);
        } else {
            if (index > K - 1) {
                System.out.println(1);
            } else {
                System.out.println(String.valueOf(S.charAt(index)));
            }
        }
        sc.close();
    }
}