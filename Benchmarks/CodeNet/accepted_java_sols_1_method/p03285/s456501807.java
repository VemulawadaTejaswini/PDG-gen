import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] a = new boolean[107];
        a[0] = true;
        for(int i = 0; i < 100; i++) {
            if(a[i]) {
                a[i + 4] = true;
                a[i + 7] = true;
            }
        }
        System.out.println(a[n] ? "Yes" : "No");
    }
}
