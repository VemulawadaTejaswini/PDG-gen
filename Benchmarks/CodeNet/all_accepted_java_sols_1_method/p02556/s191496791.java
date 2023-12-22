import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final long bill = 2000000000;
        long pos[][] = new long [n][2];
        long neo_pos[][] = new long [n][2];
        long xMax = bill * -1, xMin = bill;
        long yMax = bill * -1, yMin = bill;

        for(int i = 0; i < n; i++){
            pos[i][0] = sc.nextInt();
            pos[i][1] = sc.nextInt();
            //xy座標から座標軸を45度回転させたx'y'座標に変換する
            //x'y'座標での正確な位置は√2で割らないといけないが整数計算で処理したいので行わない
            //通常マンハッタン距離は|xi - xj| +|yi - yj|で求められるが
            //x'y'座標でマンハッタン距離を求めると|x'i - x'j|と|y'i - y'j|の大きいほうがマンハッタン距離として計算できる
            neo_pos[i][0] = pos[i][0] + pos[i][1];
            neo_pos[i][1] = pos[i][0] * -1 + pos[i][1];
            if(xMax < neo_pos[i][0]){
                xMax = neo_pos[i][0];
            }
            if(xMin > neo_pos[i][0]){
                xMin = neo_pos[i][0];
            }
            if(yMax < neo_pos[i][1]){
                yMax = neo_pos[i][1];
            }
            if(yMin > neo_pos[i][1]){
                yMin = neo_pos[i][1];
            }
        }
        //xMax xMin yMax yMinを確認
        //System.out.println("xMax=" + xMax + " xMin=" + xMin);
        //System.out.println("yMax=" + yMax + " yMin=" + yMin);
        
        //正解を出力
        long dist_x = xMax - xMin;
        long dist_y = yMax - yMin;
        if(dist_x > dist_y){
            System.out.println(dist_x);
        }else{
            System.out.println(dist_y);
        }
    }
}
