import java.math.*;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long money = 1000;

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        List<Pair> list = new ArrayList<>();

        int l = 0;
        int r = 0;
        for (int i=1; i<n; i++) {
            if (arr[i-1]<=arr[i]) {
                r++;
                if (i==n-1) {
                    Pair pair = new Pair(l, r);
                    list.add(pair);
                }
            } else {
                Pair pair = new Pair(l, r);
                list.add(pair);
                r++;
                l = r;
            }
        }

        for (int i=0; i<list.size(); i++) {
//            System.out.print(list.get(i).l + " ");
//            System.out.println(list.get(i).r);
        }

        for (int i=0; i<list.size(); i++) {
            int left = list.get(i).l;
            int right = list.get(i).r;
            long lCnt = money / (long)arr[left];
            money -= arr[left] * lCnt;
            money += arr[right] * lCnt;
//            System.out.println(money);
        }

        System.out.print(money);


    }

    class Pair {
        int l;
        int r;
        public Pair(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }

}

