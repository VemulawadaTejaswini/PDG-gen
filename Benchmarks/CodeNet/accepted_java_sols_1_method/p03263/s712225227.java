import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] a = new int[h+1][w+1];
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        StringBuilder ans = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        boolean move = false;
        int dir = 1;
        int prex = 1;
        int prey = 0;
        int cnt = 0;
        int tmpCnt = 0;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                int x = dir < 0 ? w - j + 1 : j;
                if(!move){
                    if(a[i][x] % 2 != 0){
                        move = true;
                    }
                }else{
                    tmp.append(prey + " " + prex + " " + i + " " + x + "\n");
                    tmpCnt++;
                    if(a[i][x] % 2 != 0){
                        ans.append(tmp.toString());
                        tmp = new StringBuilder();
                        move = false;
                        cnt += tmpCnt;
                        tmpCnt = 0;
                    }
                }
                prey = i;
                prex = x;
            }
            dir *= -1;
        }
        System.out.println(cnt);
        System.out.print(ans.toString());

        sc.close();
    }

}
