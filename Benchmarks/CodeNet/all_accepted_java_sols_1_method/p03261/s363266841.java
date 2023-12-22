import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Main {
   public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);

       List<String> list = new ArrayList<>();
       int N = scanner.nextInt();
       String judge = "Yes";

       for (int i = 0; i < N; i++) {
           String str = scanner.next();
           //取得した単語をlistに追加
           list.add(str);

           if (i == 0) {
               continue;
           }

           //(i-1)番目の単語の末尾文字を取得
           char end = (list.get(i-1)).charAt((list.get(i-1)).length()-1);

           //i番目の単語の先頭文字を取得
           char first = (list.get(i)).charAt(0);

           //System.out.println("前の単語の末尾文字： " + end);
           //System.out.println("先頭文字： " + first);

           //しりとりになっているか判定
           if (end != first) {
               judge = "No";
           }
       }

       //listの要素数
       //System.out.println("listの要素数：" + list.size());

       //重複を削除
       //ArrayListをHashSetに変換
       Set<String> set = new HashSet<>(list);

       //HashSetをArrayListに変換
       List<String> HashList = new ArrayList<>(set);

       //HashListの要素数
       //System.out.println("HashListの要素数：" + HashList.size());

       //しりとりになっている場合
       //judgeを成立しているという意味のブーリアンにしておいたほうが良いのでは？
        if (judge.equals("Yes")) {
            if (list.size() != HashList.size()) {
                judge = "No";
            }
        }

       System.out.println(judge);
   }
}