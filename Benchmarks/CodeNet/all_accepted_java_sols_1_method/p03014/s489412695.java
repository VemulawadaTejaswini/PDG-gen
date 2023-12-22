import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] s = new int[H][W];
        for(int i = 0; i<H; i++) {
            String str = sc.next();
            for(int j = 0; j<W; j++) {
                s[i][j] = (str.charAt(j) == '.')?1 : 0;
            }
        }

//        for(int i = 0; i<H; i++) {
//            for(int j = 0; j<W; j++) {
//                System.out.print(s[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();

        int[][] a = new int[H][W];
        int[][] b = new int[H][W];

        for(int i = 0; i<H; i++) {
            for(int j = 0; j<W; j++) {
                if(s[i][j]==0) continue;
                else if(j==0)a[i][j] = s[i][j];
                else a[i][j] = a[i][j-1] + s[i][j];

            }
        }

//        for(int i = 0; i<H; i++) {
//            for(int j = 0; j<W; j++) {
//                System.out.print(a[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();

        for(int i = 0; i<H; i++) {
            for(int j = W-2; j>=0; j--) {
                if(a[i][j]==0) continue;
                if(a[i][j+1]==0) continue;
                a[i][j] = a[i][j+1];
            }
        }

//        for(int i = 0; i<H; i++) {
//            for(int j = 0; j<W; j++) {
//                System.out.print(a[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();

        for(int i = 0; i<W; i++) {
            for(int j = 0; j<H; j++) {
                if(s[j][i]==0) continue;
                else if(j==0)b[j][i] = s[j][i];
                else b[j][i] = b[j-1][i] + s[j][i];
            }
        }

//        for(int i = 0; i<H; i++) {
//            for(int j = 0; j<W; j++) {
//                System.out.print(b[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();


        for(int i = 0; i<W; i++) {
            for (int j = H - 2; j >= 0; j--) {
                if (b[j][i] == 0) continue;
                if (b[j + 1][i] == 0) continue;
                b[j][i] = b[j + 1][i];
            }
        }

//        for(int i = 0; i<H; i++) {
//            for(int j = 0; j<W; j++) {
//                System.out.print(b[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();

        int max = 0;
        for(int i = 0; i<H; i++) {
            for(int j = 0; j<W; j++) {
                max = Math.max(a[i][j]+b[i][j]-1, max);
            }
        }

        System.out.println(max);

    }
}