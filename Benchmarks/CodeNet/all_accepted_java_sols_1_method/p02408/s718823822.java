import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // カードの枚数を受け取る
        int numberOfCards = sc.nextInt();
        
        // 4行13列の二次元配列(初期値はfalse)
        boolean[][] cardExistence = new boolean[4][13];
        
        for (int i=0; i<numberOfCards; i++) {
            String kigou = sc.next();
            int cardNum = sc.nextInt();
            
            // S:0, H:1, C:2, D:3
            if (kigou.equals("S")) 
                cardExistence[0][cardNum - 1] = true;
            else if (kigou.equals("H"))
                cardExistence[1][cardNum - 1] = true;
            else if (kigou.equals("C"))
                cardExistence[2][cardNum - 1] = true;
            else if (kigou.equals("D"))
                cardExistence[3][cardNum - 1] = true;
        }
        
        // S:0, H:1, C:2, D:3
        String[] marks = {"S", "H", "C", "D"};
        
        // 中身がfalse（ないカード）の場合、出力
        for (int i=0; i<4; i++) {
            for (int j=0; j<13; j++) {
                if (cardExistence[i][j] == false)
                    // ないカードの記号と数字を出力
                    System.out.println(marks[i] + " " + (j + 1));
            }
        }
    }
}
