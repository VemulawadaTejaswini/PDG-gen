import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        
        int ans = 0; //現地点で最も良い建設地点の番号
        double best = 100000000; //現地点で最も良い建設地点の温度差
        //小さいほど嬉しいので,ダミーの初期値はうんと大きい値にしておこう
        for(int n=1;n<=N;n++){
        	int h = sc.nextInt();
        	double temp = T - h*0.006; //この地点の気温を求める.
        	double err = Math.abs(A-temp); //目標気温との差を求める.
        	//絶対値関数がサポートされていない言語では,if-else文の分岐を使うことになるだろう
        	if(err<best){//最高記録を更新した! データを記録しよう
        		best = err;
        		ans = n;
        	}
        }
        System.out.println(ans); //答を出力
    }
}
