import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int road = sc.nextInt();
        int[] city = new int[n];
        for (int i = 0; i < road; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            city[a - 1]++;
            city[b - 1]++;
        }
        for (int tmp : city) {
            System.out.println(tmp);
        }
    }
}
