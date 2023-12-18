import java.util.*;

public class Main{
    public static void main(String... arg){
        Scanner sc = new Scanner(System.in);
        
        // マス総数squareと白マスwhite受け取り
        int square = (int)Math.pow(sc.nextInt(), 2);
        int white = sc.nextInt();
        
        // 黒マス計算し出力
        System.out.println(square - white);
        
    }

}