import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() >= k) {
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }
}
