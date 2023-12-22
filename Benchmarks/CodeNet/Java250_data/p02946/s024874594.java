
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        StringBuilder ans = new StringBuilder();
        for (int i = (m - n) + 1; i < m + n; i++) {
            ans.append(i).append(" ");
        }
        ans.deleteCharAt(ans.length() - 1);
        System.out.println(ans);


    }

}
