
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        int n = sc.nextInt();
        ArrayList<Integer> aList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            aList.add(sc.nextInt());
        }
        Collections.sort(aList);
        sc.close();
        HashSet<Integer> bList = new HashSet<Integer>();

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < j; k++) {
                if (aList.get(j) == aList.get(k)) {
                    bList.add(aList.get(j));
                }
                if (aList.get(j) % aList.get(k) == 0) {
                    aList.remove(j);
                    n--;
                    j--;
                    break;
                }
            }
        }

        System.out.println(aList.size() - bList.size());
    }
}
