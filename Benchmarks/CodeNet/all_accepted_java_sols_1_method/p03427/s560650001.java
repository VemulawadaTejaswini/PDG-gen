import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] str = s.split("");
        int top = Integer.parseInt(str[0]);
        int ans = 0;

        for (int i = 0; i < str.length; i++) {
            ans += Integer.parseInt(str[i]);
        }

        if (ans < top - 1 + 9 * (str.length - 1)) {
            ans = top - 1 + 9 * (str.length - 1);
        }

        System.out.println(ans);

    }


}
