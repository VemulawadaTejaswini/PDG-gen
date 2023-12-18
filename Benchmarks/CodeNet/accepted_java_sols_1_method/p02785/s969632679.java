import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n <= k) {
            System.out.println(0);
            return;
        }

        List<Integer> hpList = new ArrayList<>();
        for (int i = 0; i < n; i++) hpList.add(sc.nextInt());
        Collections.sort(hpList, Comparator.reverseOrder());
        
        long result = 0;
        for (int i = k; i < n; i++) result += hpList.get(i);

        System.out.println(result);
    }
}