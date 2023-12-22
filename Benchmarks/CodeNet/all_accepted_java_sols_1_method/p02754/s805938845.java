import java.util.Scanner;

/**
 * @author yoshizaki
 * ABC 156
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long count = scanner.nextLong();
        long blue = scanner.nextLong();
        long red = scanner.nextLong();

        long balls = 0;
        long bcount = 0;
        // 青だけ並ぶ
        if (count <= blue) {
            bcount = count;
        } else {
            // 青と赤が並ぶ
            // 青と赤が何セット並べられるか
            long set = (long) (count / (blue + red));
            // セット数から青の個数を出す
            bcount = set * blue;
            // 並べたボールの数を出す
            balls = set * (blue + red);
            // 青を並べきれるならそのまま追加
            if (count - balls >= blue) {
                bcount += blue;
            } else {
            // 青を並べきれない場合は残りの個数が青 
                bcount += (count - balls);
            }
        }
        System.out.println(bcount);
    }
}