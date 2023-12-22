import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Logic();
        
    }

    /**ロジック */
    public static void Logic(){

        // 標準入力
        Scanner sc = new Scanner(System.in);
        Double D = sc.nextDouble();
        Double T = sc.nextDouble();
        Double S = sc.nextDouble();
        
        // 処理
        // 出力
        if (D/S <= T){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}