import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        String[] strArray = S.split("");

        int ans = 0;

        for (int i = 0; i < strArray.length - 2; i++) {
            if (strArray[i].equals("A")) {
                if (strArray[i + 1].equals("B")) {
                    if (strArray[i + 2].equals("C")) {
                        ans += 1;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}