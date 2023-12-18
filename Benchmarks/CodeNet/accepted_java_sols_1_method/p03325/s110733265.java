import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long tmp = sc.nextLong();
            if(tmp % 2 == 0) {
                a.add(tmp);
            }
        }
        int ans = 0;
        if(a.size() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < a.size(); i++) {
            while(a.get(i) % 2 == 0) {
                a.set(i, a.get(i) / 2);
                ans++;
            }
        }
        System.out.println(ans);
    }
}