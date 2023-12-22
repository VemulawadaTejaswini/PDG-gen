import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int l = kbd.nextInt();
        int sum = 0;
        List<Integer> tastes = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            tastes.add(l + i);
            sum = sum + (l + i);
        }
        int saMin = 1000000;
        int taste = 0;
        for (int j = 0; j < n; j++) {
            int temp = 0;
            for (int k = 0; k < n; k++) {
                if (k != j) {
                    temp = temp + tastes.get(k);
                }
            }
            int saTemp = Math.abs(temp - sum);
            if (saMin > saTemp) {
                saMin = saTemp;
                taste = temp;
            }
        }
        System.out.println(taste);
    }
}