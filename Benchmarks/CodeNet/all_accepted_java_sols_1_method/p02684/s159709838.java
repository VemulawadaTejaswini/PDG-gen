import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final long K = sc.nextLong();
        int[] teleport = new int[N];
        for(int i=0; i<N; i++) {
            teleport[i]=sc.nextInt()-1;
        }

        boolean[] clear = new boolean[N];
        clear[0] = true;

        List<Integer> list = new ArrayList<>();     //<>の中のIntegerは冗長なのでいらないって言われます。実際めんどくさいので消してOK
        list.add(0);

        int twice = -1;     //初めて2回目に踏む町の番号(0<=twice<=N-1)

        for(int i=0; i<K; i++) {
            int x= teleport[list.get(i)];
            if(clear[x]) {      //既に踏んでいる町なら
                twice = x;      //twiceにxを代入しbreak
                break;
            }else {             //まだ踏んでない町なら
                list.add(x);    //行程をlistに記録して
                clear[x] = true;    //踏んだという印をつける
            }
        }

        /*
        ここまでで、もしループを踏む前に走査が終わった場合
        listの中身は{0, (0からテレポした先), (さらにテレポした先), ...}という風になって、
        そのsize()はK+1です。
        ただし、K回目にclear[x]==trueであった時、twiceを記録してbreakしてしまうので、
        twice==-1とは限りません。
         */

        if(twice==-1) {
            System.out.println(list.get((int)K)+1);     //ここが変更点。ループ到達前に走査が終わった場合は、「リストの最後の町」がそのまま答えになるはず。なおこの場合Kの大きさはたかだか2×10^5なのでテキトーにintにキャストしてよい。
        }else {
            int num =0;
            while(!list.isEmpty()) {      //小変更。好みの問題。
                if(list.get(0)==twice) {    //ループ開始点まで来たらそこで止める
                    break;
                }else {
                    list.remove(0);     //ループ開始点に到達するまで先頭の要素を消し続ける。最終的にループ構造だけが残る
                    num++;      //numでループの先頭までのステップ数を記録する
                }
            }

            /*
            K-num = ループの先頭に到達したあとさらに動かなければいけないステップ数
            list.size = ループ長
            なので、
             */

            System.out.println(list.get((int)((K-num)%list.size()))+1);     //これでOK。
        }
    }
}
