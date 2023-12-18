import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // 定数
        
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner("abcdabcd");
        
        // 文字とその出現階数をもつMap
        Map<String, Integer> strMap = new HashMap<>();
        
        // 文字列を1文字ずつ配列に格納する
        String[] strArray = sc.next().split("");
        
        for(String str : strArray) {
            // Mapに文字が存在するかどうか確認する
            if(strMap.containsKey(str)) {
                // すでに存在する場合は出現回数を+1して再格納する
                int count = strMap.get(str);
                strMap.put(str, count + 1);
            } else {
                strMap.put(str, 1);
            }
        }
        
        // 美しい文字列フラグ（trueで初期化）
        String isBeautifulStr = "Yes";
        
        for(String key : strMap.keySet()) {
            int count = strMap.get(key);
            
            // 出現回数が偶数でない場合はフラグをfalseにする
            if(count % 2 != 0) {
                isBeautifulStr = "No";
            }
        }
        
        System.out.println(isBeautifulStr);
        
    }
    
}
