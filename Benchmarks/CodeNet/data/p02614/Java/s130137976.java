import java.util.Scanner;

public class Main {
    int H, W, K;
    boolean[][] C;

    public Main() {
        Scanner scanner = new Scanner(System.in);
        H = scanner.nextInt();
        W = scanner.nextInt();
        K = scanner.nextInt();

        C = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            String R = scanner.next();

            for (int j = 0; j < W; j++) {
                if(R.charAt(j) == '.'){
                    C[i][j] = false;
                } else {
                    C[i][j] = true;
                }
            }
        }

        System.out.println(search(0, new boolean[H+W]));
    }

    int search(int N, boolean[] T){
        if(N == T.length){
            boolean[][] copy = new boolean[H][W];
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    copy[i][j] = C[i][j];
                }
            }

            for (int i = 0; i < H; i++) {
                if (T[i]){
                    for (int j = 0; j < W; j++) {
                        copy[i][j] = false;
                    }
                }
            }
            for (int i = 0; i < W; i++) {
                if(T[H+i]){
                    for (int j = 0; j < H; j++) {
                        copy[j][i] = false;
                    }
                }
            }

            int num = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (copy[i][j]){
                        num++;
                    }
                }
            }

            if(num == K){
                return 1;
            } else {
                return 0;
            }
        }

        int R;
        T[N] = true;
        R = search(N+1, T);
        T[N] = false;
        R += search(N+1, T);

        return R;
    }


    public static void main(String[] args){
        new Main();
    }
}
