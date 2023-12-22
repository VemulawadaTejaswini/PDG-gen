import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Long> input_list = new ArrayList();

        int ans = 0;

        long elm = -1;
        boolean loop_flg = true;
        for (int i = 0; i < N; i++) {
            elm = sc.nextLong();
            if (elm % 2 != 0) {
                System.out.println(ans);
                loop_flg = false;
                break;
            } else {
                input_list.add(elm);
            }
        }

        while (loop_flg) {
            for (int i = 0; i < N; i++) {
                elm = input_list.get(i);
                if (elm % 2 != 0) {
                    System.out.println(ans);
                    loop_flg = false;
                    break;
                } else {
                    input_list.set(i, elm / 2);
                }
            }
            ans++;
        }
    }
}