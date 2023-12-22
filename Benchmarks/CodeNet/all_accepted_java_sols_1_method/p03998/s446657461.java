import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String[] S ={ sc.next(), sc.next(), sc.next()};
        
        int i = 0;
        while(S[i].length() != 0){
                int turn = S[i].charAt(0) - 'a';   //先頭の文字を取得（ASCIIコードの差を取る）
                S[i] = S[i].substring(1);          //先頭の文字を削除
                i = turn;
        }
        
        //char型にキャストし、ASCIIコードと対応させる。
        System.out.println((char)('A' + i));
    }
}
