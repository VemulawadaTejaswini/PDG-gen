import java.util.Scanner;

public class Main {

        public static final int MAX = 100;
        char[][] farm = new char[MAX][MAX];
    int H, W;
    char moji;

        void infection(int i, int j)
        {
                if( farm[i][j] == moji ){
                        farm[i][j] = '+';
                        if( j + 1 < W ) infection(i, j + 1);
                        if( i + 1 < H ) infection(i + 1, j);
                        if( j - 1 >= 0) infection(i, j - 1);
                        if( i - 1 >= 0) infection(i - 1, j);
                }
        }

        void run()
        {
                @SuppressWarnings("resource")
                Scanner scan = new Scanner(System.in);

                while(true){
                        int cnt = 0;
                        int H = scan.nextInt();
                        int W = scan.nextInt();
                        if( H == 0 && W == 0) break;

                        for (int i = 0; i < H; i++){
                                farm[i] = scan.next().toCharArray();
                        }

                        for (int i = 0; i < H; i++){
                                for (int j = 0; j < W; j++){
                                        if (farm[i][j] == '+') continue;
                                        cnt++;
                    moji = farm[i][j];
                                        infection(i, j);
                                }
                        }
                        System.out.println(cnt);
                }
        }

        public static void main(String[] args) {
                new Main().run();
        }

}