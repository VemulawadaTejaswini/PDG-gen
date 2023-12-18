import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Loopで使う文字列の長さは固定！
//intで大丈夫？オーバーフローしない？
//Loop回数は本当に10⁹以内になってる？Loopは回る？？
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int W=sc.nextInt();
        int H=sc.nextInt();
        int n=sc.nextInt();
        int[][] map=new int[W][H];
        for (int i = 0; i <W; i++) {
            for (int j = 0; j < H; j++) {
                map[i][j]=1;
            }
        }
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            if(a==1){
                for (int j = 0; j < x; j++) {
                    for (int k = 0; k <H; k++) {
                        map[j][k]=0;
                    }
                }
            }else if(a==2){
                for (int j = x; j < W; j++) {
                    for (int k = 0; k < H; k++) {
                        map[j][k]=0;
                    }
                }
            }else if(a==3){
                for (int j = 0; j < W; j++) {
                    for (int k = 0; k < y; k++) {
                        map[j][k]=0;
                    }
                }
            }else{
                for (int j = 0; j < W; j++) {
                    for (int k = y; k < H; k++) {
                        map[j][k]=0;
                    }
                }
            }
        }
        int ans=0;
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                ans+=map[i][j];
            }
        }
        out.println(ans);
    }
}