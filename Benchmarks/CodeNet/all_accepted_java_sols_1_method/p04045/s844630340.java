
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] d = new int[k];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < k; i++) {
            set.add(sc.nextInt());
        }
        boolean isContained = true;
        while (isContained) {
            isContained = false;
            int temp = n;
            while(temp > 0) {
                int mod = temp % 10;
                if (set.contains(mod)) {
                    isContained = true;
                }
                temp /= 10;
            }
            if (!isContained) {
                System.out.println(n);
                return;
            }
            n++;
        }

    }

}