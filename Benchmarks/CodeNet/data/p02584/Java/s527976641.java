import java.util.*;

public class Main {
    public static void main(String[] args) {

        // とんでもないコードになってしまったｿﾞｫ...

        Scanner sc = new Scanner(System.in);
        int location = Integer.parseInt(sc.next());
        int moveCount = Integer.parseInt(sc.next());
        int moveMetol = Integer.parseInt(sc.next());


        loop: for(int i = moveCount; i > 0; i--){

            // 現在の地点のほうが大きい場合
            if(location >= moveMetol){
                location -= moveMetol;
                continue loop;
            }

            // 移動距離のほうが大きいとき
            if(location <= moveMetol){
                location += moveMetol;

            }
        }

        System.out.println(location);

    }
}