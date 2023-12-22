import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        sc.close();

        List<Integer> num = new ArrayList<Integer>();
        int obj = 1;
        int counter = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == (char)('0' + obj)) {
                counter++;
            } else {
                num.add(counter);
                obj = 1 - obj;
                counter = 1;
            }
        }
        if (counter != 0) {
            num.add(counter);
        }
        if (num.size() % 2 == 0) {
            num.add(0);
        }

        int len = 2 * K + 1;
        int ans = 0;
        int temp;
        int sum[] = new int[num.size() + 1];
        sum[0] = 0;
        for (int i = 0; i < num.size(); i++) {
            sum[i + 1] = sum[i] + num.get(i);
        }
        for (int i = 0; i < num.size(); i += 2) {
            int left = i;
            int right = Math.min(i + len, sum.length - 1);
            temp = sum[right] - sum[left];
            ans = Math.max(ans, temp);
        }
        System.out.println(ans);
    }
}