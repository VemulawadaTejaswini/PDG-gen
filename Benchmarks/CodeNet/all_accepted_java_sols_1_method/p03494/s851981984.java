
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        boolean flag = true;
        int ans = 0;
        while (flag) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)%2 == 0) {
                    list.set(i, list.get(i)/2);
                } else {
                    flag = false;
                }
            }
            if (flag) ans++;
        }
        System.out.println(ans);
    }
}