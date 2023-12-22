import java.util.*;

class Main {

    //再帰的に1の個数を探すメソッド
    public static int useRecursionToCountChars (String str, char key, int index){
        if (index >= str.length()) {
            return 0;
        }
        
        //文字列とキーが一致したらcountに1を入れる、そうでなければ0
        int count = str.charAt(index) == key? 1:0;
        //カウントに数を足して再帰処理、インデックスが文字列の長さを超えたらリターン
        return count + useRecursionToCountChars(str,key,index + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = useRecursionToCountChars (str,'1', 0);
        System.out.println(result);
    }
}