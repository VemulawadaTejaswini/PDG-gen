import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String a = sc.next();
        sc.close();
        int ans = 1;
        String s[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        for (int i = 0; i < 7; i++) {
            if (s[i].equals(a)) {
                ans = 7 - i;
                break;
            }
        }
        // 出力
        System.out.println(Integer.toString(ans));
    }
}
