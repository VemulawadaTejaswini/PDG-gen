import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int ans = (n * (n - 1) / 2) + (m * (m - 1)/ 2);
        System.out.println(ans);
    }
}