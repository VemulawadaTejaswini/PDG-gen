import java.util.*;
public class Main {

    public static void main(String[] args) {

        //標準入力
        Scanner sc = new Scanner(System.in);

        //変数
        int distance = sc.nextInt();
        int speed = sc.nextInt();
        int time = sc.nextInt();

        //入力された情報をもとに時間を計算する　※　時間＝　距離÷速さ
        int totalTime = distance / speed;
        //Atcorder用
        if (time >= totalTime){
            System.out.println("Yes");
        }else if (time < totalTime){
            System.out.println("No");
        }
    }
}
