import java.util.Scanner;
import java.util.Arrays;

/**
 * ABC042B
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();

        /** 空読み */
        sc.nextLine();

        String[] strs = new String[N];
        String ans = "";

        for (int i = 0; i < N; i++) {
            strs[i] = sc.nextLine();
        }

        Arrays.sort(strs);
        
        for (String string : strs) {
            ans += string;
        }

        System.out.println(ans);
    }
}