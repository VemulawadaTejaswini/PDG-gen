import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        boolean[][] field = new boolean[h][w];

        for(int i = 0; i < h; i++){
            String str = sc.next();
            for(int j = 0; j < w; j++){
                field[i][j] = str.charAt(j) == '#';
            }
        }

        int ans = 0;

        for(int hbit = 0; hbit < (1 << h); hbit++){
            for(int wbit = 0; wbit < (1 << w); wbit++){

                int count = 0;

                for(int i = 0; i < h; i++){
                    for(int j = 0; j < w; j++){
                        if(((hbit >> i) & 1) == 0 && ((wbit >> j) & 1) == 0 && field[i][j]){
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