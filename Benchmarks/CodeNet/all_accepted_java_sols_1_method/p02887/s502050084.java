import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] s = sc.next().split("");

        String preColor = "";
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (!preColor.equals(s[i])) {
                result++;
            }
            preColor = s[i];
        }

        System.out.println(result);
    }
}