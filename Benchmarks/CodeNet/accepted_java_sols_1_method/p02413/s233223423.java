import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] s = new int[h+1][w+1];

        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                int n = sc.nextInt();
                s[i][j] = n;
                s[i][w] += n;
                s[h][j] += n;
            }
        }

        for(int i=0; i<h+1; i++) {
            for(int j=0; j<w+1; j++) {
                if(i == h && j == w) {
                    System.out.println(s[h][w]);
                } else if(j == w) {
                    System.out.println(s[i][j]);
                    s[h][w] += s[i][j];
                } else {
                    System.out.print(s[i][j] + " ");
                }
            }
        }
    }
}

