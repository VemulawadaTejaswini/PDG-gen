import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final int SIZE = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            System.out.println(primeCount(sc.nextInt()));
        }
        sc.close();
    }

    static int primeCount(int n) {
        ArrayList<Integer> primeList = new ArrayList<Integer>(SIZE);
        primeList.add(2);
        primeList.add(3);
        int count = 2;
        if(n<4) {
            return n-1;
        }
        for (int i = 5; i <= n; i += 2) { //対象は奇数のみ
            boolean wflag = false; //割り切れたかどうか
            for (int j = 1; primeList.get(j) * primeList.get(j) <= i; j++) {
                // 対象の数の平方根以下の全ての素数で除算する
                if (0 == i % primeList.get(j)) { //割り切れたら素数ではない
                    wflag = true;
                    break;
                }
            }
            if (!wflag) { //最後まで割り切れなかったら
                primeList.add(i); //素数として新たに登録
                count++;
            }
        }
        return count;
    }
}
