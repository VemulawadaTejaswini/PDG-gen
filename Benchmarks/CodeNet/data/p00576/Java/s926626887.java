import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();           //コマの数
        int[] X = new int[N];           //各コマの止まっているマス
        for(int i = 0; i < N; i++){
            X[i] = sc.nextInt();
        }
        int M =sc.nextInt();            //移動する回数
        for(int i = 0; i < M; i++){
            int A = sc.nextInt() - 1;   //今回移動を行うコマ番号
            boolean stayFlag = false;
            for(int n = 0; n < N; n++){
                if(n == A) continue;    //同じコマ同士は比較しない
                if((X[A] == 2019) || ((X[A] + 1) == X[n])) stayFlag = true; //止まっているマスがゴール、もしくは隣のマスに他のコマが止まっていたら移動しない
            }
            if(!stayFlag) X[A]++;   //とどまるフラグが立っていなければ１マス進む
        }
        for(int i = 0; i < N; i++){
            System.out.println(X[i]);
        }
    }
}

