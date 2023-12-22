import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        boolean flg = true;
        if (s[0] != 'A') {
            flg = false;
        }

        boolean flg2 = false;
        for (int i = 2 ; i < s.length - 1 ; i++) {
            if (s[i] == 'C') {
                flg2 = true;
            }
        }

        int large = 0;
        for (int i = 0 ; i < s.length ; i++) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
                large++;
            }
        }
        System.out.println(flg && flg2 && large == 2 ? "AC" : "WA");

    }

}
