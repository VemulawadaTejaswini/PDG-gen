import java.util.*;

public class Main {
    static long count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //カードの枚数
        Cards[] cards = new Cards[n]; //カードの配列
        for(int i=0; i<n; i++) { //情報格納
            cards[i] = new Cards(sc.next(), sc.nextInt(), i);
        }

        quickSort(cards, 0, n-1);

        String s = "Stable";
        for(int i=0; i<n-1; i++) {
            //同じ数字の要素が並んでいる && インデックスが前にある要素の方が大きい場合
            //ソートの際に順番が逆転しているので不安定なソートとみなす
            if(cards[i].num==cards[i+1].num && cards[i].i>cards[i+1].i) {
                s = "Not stable";
                break;
            } 
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            if(i==n-1) sb.append(cards[i].pic + " " + cards[i].num);
            else sb.append(cards[i].pic + " " + cards[i].num + "\n");
        }
        System.out.println(s); //出力（安定or不安定）
        System.out.println(sb); //出力（並べ替え後のカード）
    }
    /**
     * トランプカード格納クラス
     */
    static class Cards {
        String pic;
        int num;
        int i;
        Cards (String pic, int num, int i) {
            this.pic = pic;
            this.num = num;
            this.i = i;
        }
    }
    /**
     * クイックソート
     */
    static void quickSort(Cards[] c, int p, int r) {
        if(p<r) {
            int x = partition(c, p, r);
            quickSort(c, p, x-1);
            quickSort(c, x+1, r);
        }
    }
    /**
     * Partition
     */
    static int partition(Cards[] c, int p, int r) {
        int x = c[r].num;
        int i = p-1;
        Cards tmp;
        for(int j=p; j<r; j++) {
            if(c[j].num<=x) {
                i += 1;
                tmp = c[j];
                c[j] = c[i];
                c[i] = tmp;
            }
        }
        tmp = c[i+1];
        c[i+1] = c[r];
        c[r] = tmp;
        return i+1;
    }
}
