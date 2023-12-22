import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int width = S.length();
        int cnt = 0;
        int forward = 0;
        int backward = 0;

        for (int i = 0; i < S.length(); i++) {
            if ((S.charAt(i) - 48) != ((i + 1) % 2)) {
                forward++;
            } else {
                backward++;
            }
        }

        System.out.println(Math.min(forward, backward));
    }
}
