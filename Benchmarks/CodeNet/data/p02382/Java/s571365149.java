import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int inputNumLength = sc.nextInt();
        int[] x = new int[inputNumLength];
        int[] y = new int[inputNumLength];
        
        //入力
        for(int i = 0; i < inputNumLength; i++){
            x[i] = sc.nextInt();
        }
        for(int i = 0; i < inputNumLength; i++){
            y[i] = sc.nextInt();
        }
        
        MinkowskiLength ml = new MinkowskiLength(x, y);
        System.out.println(ml.manhattanLength());
        System.out.println(ml.euclidLength());
        System.out.println(ml.p3WhenLength());
        System.out.println(ml.chebyshevLength());
    }
}

class MinkowskiLength{
    int[] x;
    int[] y;
    //コンストラクタ
    public MinkowskiLength(int[] x, int[] y){
        this.x = x;
        this.y = y;
    }
    
    //マンハッタン距離
    public double manhattanLength(){
        double sum = 0;
        for(int i = 0; i < x.length; i++){
            sum += Math.abs(x[i] - y[i]);
        }
        return sum;
    }
    
    //ユークリッド距離
    public double euclidLength(){
        double sum = 0;
        for(int i = 0; i < x.length; i++){
            sum += Math.pow(Math.abs(x[i] - y[i]), 2);
        }
        return Math.sqrt(sum);
    }
    
    //P=3のとき
    public double p3WhenLength(){
        double sum = 0;
        for(int i = 0; i < x.length; i++){
            sum += Math.pow(Math.abs(x[i] - y[i]), 3);
        }
        return Math.cbrt(sum);
    }
    
    //チェビシェフ距離
    public double chebyshevLength(){
        double sum = 0;
        double max = 0;
        for(int i = 0; i < x.length; i++){
            max = Math.max(max, Math.abs(x[i] - y[i]));
        }
        return max;
    }
}
