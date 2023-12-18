import java.util.Scanner;

public class Main {
    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            if(n+m+a == 0) break;
            boolean horizon[][][] = new boolean[1000][n+1][n+1];
            int hMax = 0;
            for(int i = 0; i<n; i++){
                int h = sc.nextInt();
                int p = sc.nextInt();
                int q = sc.nextInt();
                horizon[h][p][q] = true;
                hMax = Math.max(hMax, h);
            }
            int now = a;
            for(int i=hMax; 0<i; i--){
                if(1 <= now-1 && horizon[i][now-1][now]){
                    now--;
                }
                else if(now+1 < n+1 && horizon[i][now][now+1]){
                    now++;
                }
                else{
                    //nowのまま
                }
            }
            System.out.println(now);
        }
    }
    public static void main(String[] args) {
        //new AOJ2001().run();
        new Main().run();
    }
}