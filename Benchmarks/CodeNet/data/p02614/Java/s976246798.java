import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        int k = scan.nextInt();
        char[][] c = new char[h][w];
        for(int i = 0; i < h; i++){
            String s = scan.next();
            for(int j = 0; j < w; j++){
                c[i][j] = s.charAt(j);
            }
        }
        int out = 0;
        for(int i = 0; i < 1 << h; i++){
            for(int j = 0; j < 1 << w; j++){
                int ck = 0;
                char[][] cc = new char[h][w];
                for(int l = 0; l < h; l++) System.arraycopy(c[l], 0, cc[l], 0, w);
                for(int l = 0; l < h; l++){
                    if((1 & i >> l) == 1) Arrays.fill(cc[l], 'R');
                }
                for(int l = 0; l < w; l++){
                    if((1 & j >> l) == 1){
                        for(int m = 0; m < h; m++) cc[m][l] = 'R';
                    }
                }
                for(int l = 0; l < h; l++){
                    for(int m = 0; m < w; m++){
                        if(cc[l][m] == '#') ck++;
                    }
                }
                if(ck == k) out++;
            }
        }
        System.out.println(out);
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
