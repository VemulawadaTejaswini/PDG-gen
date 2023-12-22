import java.util.*;
 
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //入力値を設定する
        String sentence = sc.next();
        
        //1文字ずつ分割する
        List<String> chars = Arrays.asList(sentence.split(""));
        
        //反転した文字列を取得する
        List<String> revChars = Arrays.asList(sentence.split(""));
        Collections.reverse(revChars);
        
        
        //回文にするかの判定：1文字ずつ比較する回数を取得する
        Integer comparisonCnt = 0;
        //文字数が奇数の場合は(chars-1)/2回比較する
        //文字列が偶数の場合はchars/2回比較する
        if(sentence.length() % 2 == 1) {
            comparisonCnt = (sentence.length() - 1) / 2;
        } else {
            comparisonCnt = sentence.length() / 2;
        }
        
        Integer cnt = 0;
        
        for (int i = 0; i < comparisonCnt; i++) {
            if(!(chars.get(i).equals(revChars.get(i)))) {
                cnt++;
            }
        }
        
        //出力する
        System.out.println(cnt);
    
    }    
}