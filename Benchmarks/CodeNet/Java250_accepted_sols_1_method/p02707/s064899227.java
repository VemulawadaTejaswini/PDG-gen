import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] ls = new int[N];
        for (int i = 0; i < N-1; i++) {
            int boss = scan.nextInt();
            ls[boss-1] ++;
        }
        for (int i:ls) {
            System.out.println(i);
        }
    }
}

