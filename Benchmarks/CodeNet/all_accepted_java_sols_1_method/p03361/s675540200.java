import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();

        char[][] s = new char[h][w];
        for(int i=0; i<h; i++) {
            s[i] = sc.nextLine().toCharArray();
        }
        sc.close();

        //right, up, left, down
        int[] x = {0, -1, 0, 1};
        int[] y = {1, 0, -1, 0};

        boolean[][] isVisited = new boolean[h][w];
        int cnt = 0;
        int foundCnt = 0;

        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                if(s[i][j] == '#') {
                    cnt++;
                    for(int k=0; k<4; k++) {
                        int nx = i+x[k];
                        int ny = j+y[k];
                        if( nx >= 0 && nx < h && ny >= 0 && ny < w &&
                            s[nx][ny] == '#' && !isVisited[nx][ny]) {
                            isVisited[nx][ny] = true;
                            foundCnt++;
                        }
                    }
                }
            }
        }
        if(cnt == foundCnt) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
