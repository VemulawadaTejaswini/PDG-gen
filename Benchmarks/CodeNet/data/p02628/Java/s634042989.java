
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        // 果物の種類
        int fruit_type = sc.nextInt();
        // 購入数
        int count = sc.nextInt();
        //果物毎の価格リスト
        ArrayList<Integer> fruit_list = new ArrayList<>();
        for(int i = 0; i < fruit_type;i++) {
            fruit_list.add(sc.nextInt());
        }
        // 価格リストを昇順ソート
        Collections.sort(fruit_list);
        //価格リストの先頭から購入数の数だけ加算
        int sum = 0;
        for(int i = 0; i<count;i++) {
            sum += fruit_list.get(i);
        }
        System.out.println(sum);

    }

}
