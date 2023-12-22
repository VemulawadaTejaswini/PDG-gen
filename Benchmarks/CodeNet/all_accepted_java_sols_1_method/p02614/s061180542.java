import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        char[][] c = new char[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            c[i] = s.toCharArray();
        }
        int ans=0;
        for (int i = 0; i < (1 << h); i++) {
            for (int j = 0; j < (1 << w); j++) {
                int black = 0;
                for (int y = 0; y < h; y++) {
                    for (int x = 0; x < w; x++) {
                        if (((i >> y) & 1) == 0 && ((j >> x) & 1) == 0 && c[y][x] == '#') {
                            black++;
                        }
                    }
                }
                if (black == k){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

}
