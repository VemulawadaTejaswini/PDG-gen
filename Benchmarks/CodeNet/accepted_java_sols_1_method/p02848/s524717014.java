import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        String convertStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < convertStr.length(); j++) {
                if (s.charAt(i) == convertStr.charAt(j)) {
                    ans += String.valueOf(convertStr.charAt(j + n));
                    break;
                }

            }
        }
        System.out.println(ans);

        sc.close();
    }

}
