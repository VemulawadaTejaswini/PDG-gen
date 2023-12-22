import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split("");
        int len = 0;
        int r = 0;
        for (String s :
                S) {
            if (s.matches("(A|C|G|T)")) {
                len++;
                if (len > r) r = len;
            } else {
                len = 0;
            }
        }
        System.out.println(r);
    }
}