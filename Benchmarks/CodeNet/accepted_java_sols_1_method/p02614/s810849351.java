import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int[][] field = new int[h][w];

        for(int i = 0; i < h; i++){
            String str = sc.next();
            for(int j = 0; j < w; j++){
                field[i][j] = str.charAt(j) == '.' ? 1 : 2;
            }
        }

        int ans = 0;

        for(int hbit = 0; hbit < (1 << h); hbit++){
            for(int wbit = 0; wbit < (1 << w); wbit++){
                int[][] f = new int[h][w];
                for(int i = 0; i < h; i++){
                    for(int j = 0; j < w; j++){
                        f[i][j] = field[i][j];
                    }
                }

                for(int i = 0; i < h; i++){
                    if((hbit & (1 << i)) == (1 << i)){
                        for(int j = 0; j < w; j++){
                            f[i][j] = 3;
                        }
                    }
                }

                for(int i = 0; i < w; i++){
                    if((wbit & (1 << i)) == (1 << i)){
                        for(int j = 0; j < h; j++){
                            f[j][i] = 3;
                        }
                    }
                }

                int count = 0;
                for(int i = 0; i < h; i++){
                    for(int j = 0; j < w; j++){
                        if(f[i][j] == 2){
                            count++;
                        }
                    }
                }

                if(count == k){
                    ans++;
                }

            }
        }

        System.out.println(ans);

    }
}