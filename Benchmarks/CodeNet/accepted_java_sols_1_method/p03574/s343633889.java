import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] S = new String[H];

        for(int i = 0; i < H; i++){
            S[i] = sc.next();
        }
        
        char[][] s = new char[H][W];
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                s[i][j] = S[i].charAt(j);
            }
        }
        //地雷のない箇所を0で置換
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(s[i][j] != '#') s[i][j] = '0';
            }
        }
        
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                //s[i][j]に地雷があったとき、地雷のない周囲8マスをカウントアップ()する。
                if(s[i][j] == '#'){
                    for(int k = -1; k <= 1; k++){
                        for(int l = -1; l <= 1; l++){
                            if(((0 <= i + k && i + k < H) && (0 <= j + l && j + l < W)) && (!(k == 0 && l == 0))){
                                if(s[i + k][j + l] != '#'){
                                    s[i + k][j + l]++;
                                }
                            }
                        } 
                    }
                }
            }
        }

        for(int i = 0; i< H; i++){
            for(int j = 0; j < W; j++){
                System.out.print(s[i][j]);
            }
            System.out.println("");
        }
    }
}
