import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H,W,K;
        H = sc.nextInt();
        W = sc.nextInt();
        K = sc.nextInt();
        char[][]mat = new char[H][W];
        for (int i = 0; i < H; i++) {
            mat[i] = sc.next().toCharArray();
        }
        int row = (int)Math.pow(2,H);
        int col = (int)Math.pow(2,W);
        int ans =0;
        for(int r = 0; r < row;r++){
            for(int c = 0;c < col;c++){
                int count = 0;
                for(int i = 0;i < H;i++){
                    for(int j = 0;j < W;j++){
                        if((r >> i & 1) == 1 && (c >> j & 1) == 1 && mat[i][j]=='#')
                            count++;
                    }
                }
                if(count == K)
                    ans++;
            }
        }
        System.out.println(ans);
    }
}
