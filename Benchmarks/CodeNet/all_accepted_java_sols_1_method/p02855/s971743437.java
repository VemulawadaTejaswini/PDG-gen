
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        boolean[] b = new boolean[h];
        int[][] g = new int[h][w];
        int c = 0;
        for(int i=0; i<h; i++) {
            char[] s = sc.next().toCharArray();
            for(int j=0; j<w; j++) {
                if(s[j] == '#') {
                    c++;
                    g[i][j] = c;
                }
            }
        }

        for(int i=0; i<h; i++) {
            for(int j=1; j<w; j++) {
                if(g[i][j] == 0) {
                    g[i][j] = g[i][j-1];
                }
            }
            for(int j=w-2; j>=0; j--) {
                if(g[i][j] == 0) {
                    g[i][j] = g[i][j+1];
                }
            }
        }
        for(int j=0; j<w; j++) {
            for(int i=1; i<h; i++) {
                if(g[i][j] == 0) {
                    g[i][j] = g[i-1][j];
                }
            }
            for(int i=h-2; i>=0; i--) {
                if(g[i][j] == 0) {
                    g[i][j] = g[i+1][j];
                }
            }
        }
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                if(j>0) {
                    System.out.print(" ");
                }
                System.out.print(g[i][j]);
            }
            System.out.println();
        }

    }

}
