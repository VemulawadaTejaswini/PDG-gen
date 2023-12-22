import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        ArrayList list = new ArrayList<Integer>();

        list.add(s);

        int ans = 0;
        for (int i = 0; i <= 1000000; i++) {
            if ((int)list.get(i) % 2 == 0) {
                if (list.contains((int)list.get(i) / 2)) {
                    ans = i + 2;
                    break;
                }
                list.add((int)list.get(i) / 2);
            } else {
                if (list.contains(3 * (int)list.get(i) + 1)) {
                    ans = i + 2;
                    break;
                }
                list.add(3 * (int)list.get(i) + 1);
            }
        }

        System.out.println(ans);
    }
}
