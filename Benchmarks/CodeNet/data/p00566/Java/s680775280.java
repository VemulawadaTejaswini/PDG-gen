import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] a = new int[h][w];
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                a[i][j] = sc.nextInt();
            }
        }
         
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                int now = 0;
                for(int k = 0; k < h; k++) {
                    for(int l = 0; l < w; l++) {
                        now += Math.min(Math.abs(i - k), Math.abs(j - l)) * a[k][l];
                    }
                }
                ans = Math.min(ans, now);
            }
        }
         
        System.out.println(ans);
    }
}
