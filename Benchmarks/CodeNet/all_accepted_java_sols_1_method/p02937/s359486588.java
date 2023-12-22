import java.util.Scanner;
import java.util.TreeSet;
import java.util.HashMap;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final String s = scan.next();
        final char[] sArray = s.toCharArray();
        final String t = scan.next();
        final char[] tArray = t.toCharArray();
        scan.close();
        int prev = 0;       // 前文字の位置
        long result = s.length();
        HashMap<Character,TreeSet<Integer>> index = new HashMap<Character,TreeSet<Integer>>();
        TreeSet<Integer> tmp = null;
        // s内の各英文字がどの位置に出現しているかを記録
        for(int i = 0; i < s.length(); i++){
            if(!index.containsKey(sArray[i])){
                tmp = new TreeSet<Integer>();
            }else{
                tmp = index.get(sArray[i]);
            }
            tmp.add(i + 1);
            index.put(sArray[i], tmp);
        }

        for(int i = 0; i < t.length(); i++){
            if(!index.containsKey(tArray[i])){
                System.out.println("-1");
                return;
            }
            tmp = index.get(tArray[i]);
            // 前回位置より大きい値の中で最小を取り出す
            if(tmp.higher(prev) == null){
                // 値が存在しない場合
                result += s.length();
                prev = tmp.first();
            }else{
                // 値が存在する場合
                prev = tmp.higher(prev);
            }
        }
        result = result - (s.length() - prev);
        System.out.println(result);
        scan.close();
    }
}