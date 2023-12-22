
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int x = in.nextInt();
        int dis = 0;
        int count = 0;
        if (count <= x) {
            count++;
        }
        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            dis += l;
            if (dis <= x) {
                count++;
            }
        }
        System.out.println(count);
    }
}
