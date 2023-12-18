import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        // 値の出現回数をカウント
        Integer[] oddIndexCount = new Integer[100001];
        Arrays.fill(oddIndexCount, 0);
        for (int i = 0; i < n; i += 2) {
            oddIndexCount[a[i]]++;
        }
        Integer[] evenIndexCount = new Integer[100001];
        Arrays.fill(evenIndexCount, 0);
        for (int i = 1; i < n; i += 2) {
            evenIndexCount[a[i]]++;
        }

        // 最大と2番目の出現回数を記録
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(Arrays.asList(oddIndexCount));
        int oddIndexCountFirst = pq.poll();
        int oddIndexCountSecond = pq.poll();
        pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(Arrays.asList(evenIndexCount));
        int evenIndexCountFirst = pq.poll();
        int evenIndexCountSecond = pq.poll();

        // 最大個数の値を取得
        int oddIndexNumber = 0;
        for (int i = 1; i < oddIndexCount.length; i++) {
            if (oddIndexCount[i] == oddIndexCountFirst) {
                oddIndexNumber = i;
                break;
            }
        }
        int evenIndexNumber = 0;
        for (int i = evenIndexCount.length - 1; 1 <= i; i--) {
            if (evenIndexCount[i] == evenIndexCountFirst) {
                evenIndexNumber = i;
                break;
            }
        }

        int result = n;
        if (oddIndexNumber == evenIndexNumber) {
            result -= Math.max(oddIndexCountFirst + evenIndexCountSecond, oddIndexCountSecond + evenIndexCountFirst);
        } else {
            result -= (oddIndexCountFirst + evenIndexCountFirst);
        }

        // 出力
        System.out.println(result);
    }
}
