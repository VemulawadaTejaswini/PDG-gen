import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ans[] = new int[4];
        String str[] = {"AC", "WA", "TLE", "RE"};

        for (int i = 0; i < N; i++) {
            String S = sc.next();
            if (S.equals("AC")) ans[0]++;
            else if (S.equals("WA")) ans[1]++;
            else if (S.equals("TLE")) ans[2]++;
            else ans[3]++;
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(str[i]);
            System.out.print(" x ");
            System.out.println(ans[i]);
        }
    }
}
