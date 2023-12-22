import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        char[][] c = new char[h][w];
        for(int i=0; i<h; i++) {
            String s = sc.next();
            for(int j=0; j<w; j++) {
                c[i][j] = s.charAt(j);
            }
        }
        sc.close();

        int ans = 0;
        for(int biti=0; biti<(1<<h); biti++) {
            for(int bitj=0; bitj<(1<<w); bitj++) {
                int cnt = 0;
                for(int i=0; i<h; i++) {
                    for(int j=0; j<w; j++) {
                        if((biti >> i & 1) == 1) continue;
                        if((bitj >> j & 1) == 1) continue;
                        if(c[i][j] == '#') cnt++;
                    }
                }
                if(cnt == k) ans++;
            }
        }
        System.out.println(ans);
    }
}
