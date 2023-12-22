import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int[] ans = new int[n + 1];
        int total = 0;
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n; i >= 1; i--) {
            int count = 0;
            for (int j = 2; j * i <= n; j++) {
                count += ans[j * i];
            }
            if (count % 2 != arr[i]) {
                ans[i] = 1;
                list.add(i);
            }
        }
        System.out.println(list.size());
        if (list.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i < list.size() - 1) {
                sb.append(" ");
            }
            sb.append(list.get(i));
        }
        System.out.println(sb);
        
    }
}