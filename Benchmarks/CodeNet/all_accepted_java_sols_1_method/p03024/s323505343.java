import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split("");
        final String NG = "x";
        int cnt = 0;
        for (String str : strs) {
            if (str.equals(NG)) {
                cnt++;
                if (cnt == 8) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}