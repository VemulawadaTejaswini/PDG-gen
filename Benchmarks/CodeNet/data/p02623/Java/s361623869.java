import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        long sum = 0;

        List<Integer> listA = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            listA.add(sc.nextInt());
        }
        List<Integer> listB = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            listB.add(sc.nextInt());
        }

        while (sum <= (long)k) {
            int read = 0;
            // A,Bが0の時
            if (listA.size() == 0 && listB.size() == 0) {
                break;
            }
            // Aが0の時
            if (listA.size() == 0) {
                // Bを読む
                read = listB.get(0);
                listB.remove(0);
                // Bが0の時
            } else if (listB.size() == 0) {
                // Aを読む
                read = listA.get(0);
                listA.remove(0);
                // Aの一番上の分数がBの一番上の分数より短いとき読む本を決める
            } else if (listA.get(0) <= listB.get(0)) {
                read = listA.get(0);
                listA.remove(0);
            } else {
                read = listB.get(0);
                listB.remove(0);
            }

            sum = sum + (long)read;
            // 読む本の合計がk分を超えたとき、終わり
            if (sum > (long)k) {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}