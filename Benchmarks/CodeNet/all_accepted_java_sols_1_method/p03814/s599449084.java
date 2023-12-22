import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length; i++) {
            if (!"A".equals(s[i])) {
                continue;
            }
            start = i;
            break;
        }
        for (int i = s.length - 1; i >= 0; i--) {
            if (!"Z".equals(s[i])) {
                continue;
            }
            end = i;
            break;
        }
        System.out.println(end - start + 1);
    }

}
