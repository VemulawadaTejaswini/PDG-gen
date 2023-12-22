import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        int total = 0;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            s[i] = num;
            total += num;
        }
        Arrays.sort(s);
        if(total % 10 != 0) {
            System.out.println(total);
            return;
        }
        for(int i = 0; i < n; i ++) {
            if(s[i] % 10 != 0) {
                System.out.println(total - s[i]);
                return;
            }
        }
        System.out.println(0);
    }
}