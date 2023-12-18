import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0, S);

        sc.close();

        int ans = 1;
        int i = 1;
        while (true) {
            int tmp = list.get(i - 1);

            if (tmp % 2 == 0) {
                if (list.contains(tmp / 2) && i > 1) {
                    ans = i;
                    break;
                }
                list.add(i, tmp / 2);
            } else {
                if (list.contains(3 * tmp + 1) && i > 1) {
                    ans = i;
                    break;
                }
                list.add(i, 3 * tmp + 1);
            }
            i++;
        }

        System.out.println(ans + 1);
    }
}