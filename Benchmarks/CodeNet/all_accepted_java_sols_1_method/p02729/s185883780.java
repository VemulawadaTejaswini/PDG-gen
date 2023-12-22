import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int even = 0;
        int odd = 0;
        for (int i = 0; i < n ; i++) {
            even += i;
        }
        for (int i = 0; i < m ; i++) {
            odd += i;
        }

        System.out.println(even+odd);
    }
}