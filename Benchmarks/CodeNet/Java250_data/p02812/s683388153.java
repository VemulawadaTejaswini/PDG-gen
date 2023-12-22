import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String S = sc.next();
        String N = "";
        int count = 0;

        if (S.contains("ABC")) {
            N = S.replace("ABC", "1");
        }

        for (char cha : N.toCharArray()) {
            if (cha == '1') {
                count += 1;
            }
        }
        System.out.println(count);
    }
}