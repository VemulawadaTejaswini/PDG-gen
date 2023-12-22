import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();    //高橋君のモンスターの体力
        int B =sc.nextInt();    //高橋君のモンスターの攻撃力
        int C =sc.nextInt();    //青木君のモンスターの体力
        int D =sc.nextInt();    //青木君のモンスターの攻撃力
        
        while (true){  //どちらかが勝つまで
            C -= B; //高橋君の攻撃
            if (C <= 0){  //青木君のモンスターの体力が先に0になったとき
                System.out.println("Yes");
                break;
            }
                
            A -= D; //青木君の攻撃
            if (A <= 0){  //高橋君のモンスターの体力が先に0になったとき
                System.out.println("No");
                break;
            }
        }
        
    }       
}