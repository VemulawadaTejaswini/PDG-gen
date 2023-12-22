import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // 数値の取得
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        scn.close();
        
        //一の位の取得
        int x = i % 10;
        
        //一の位に応じた分岐
        if(x == 3) {
            System.out.println("bon");
        } else if(x == 2 || x == 4 || x == 5 || x == 7 || x == 9) {
            System.out.println("hon");
        } else {
            System.out.println("pon");
        }
    }
}