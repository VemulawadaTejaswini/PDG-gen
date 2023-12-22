import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        boolean[] h = new boolean[H];
        Arrays.fill(h, true);
        boolean[] w = new boolean[W];
        Arrays.fill(w, true);
        char[][] tmp = new char[H][W];
        for(int i = 0; i < H; i++){
            char[] t = sc.next().toCharArray();
            tmp[i] = t;
            for(int j = 0; j < W; j++){
                if(t[j] == '#'){
                    h[i] = false;
                    w[j] = false;
                }
            }
        }
        sc.close();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < H; i++){
            if(h[i]) continue;
            for(int j = 0; j < W; j++){
                if(w[j]) continue;
                ans.append(String.valueOf(tmp[i][j]));
            }
            ans.append("\n");
        }
        System.out.println(ans.toString());

    }

}
