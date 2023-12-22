import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String C = sc.next();
        char c[] = C.toCharArray();
        String eng = "abcdefghijklmnopqrstuvwxyz";
        
        for(int i = 0; i < 25; i++){
            if(c[0] == eng.charAt(i)){
                c[0] = eng.charAt(i+1);
                break;
            }
        }

        // 出力
        System.out.println(c[0]);
    }
}