import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tHP = sc.nextInt();
        int tAtack = sc.nextInt();
        int aHP = sc.nextInt();
        int aAtack = sc.nextInt();
        boolean isTkhsWin = false;

        while(true) {
            // 高橋の攻撃
            aHP -= tAtack;
            if (aHP <= 0) {
                isTkhsWin = true;
                break;
            }
            // 青木の攻撃
            tHP -= aAtack;
            if (tHP <= 0) {
                isTkhsWin = false;
                break;
            }
        }
        String result = isTkhsWin ? "Yes" : "No";
        System.out.println(result);
    }
}