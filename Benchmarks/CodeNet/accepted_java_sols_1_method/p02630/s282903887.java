import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[100001];

        long ans = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            array[a]++;
            ans += a;
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = array[a];
            array[a] = 0;
            array[b] += c;
            ans += (b - a) * c;
            System.out.println(ans);
        }
        
    }

}
