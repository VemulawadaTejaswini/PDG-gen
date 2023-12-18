import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] arg){
        Main m = new Main();
        m.run();
    }

    void run(){

        for(;;){
            int n =sc.nextInt();
            int m =sc.nextInt();
            int t =sc.nextInt();
            int p =sc.nextInt();

            if((n | m | t | p) ==0){
                break;
            }

            int map[][] = new int[n][m];

            for(int i =0; i < n;i++){
                Arrays.fill(map[i],1);
            }

            for(int i = 0; i < t; i++){
                int next[][] = new int[n][m];

                int d = sc.nextInt();
                int c = sc.nextInt();

                for(int j = 0; j < n; j++){
                    for(int k = 0 ;k<m ; k++){

                        int jj = j ;
                        int kk = k;
                        if(d == 1){
                            jj = jj -c;
                            if(jj < 0){
                                jj = -jj-1 ;
                            }
                        }
                        if(d == 2){
                            kk = kk - c;
                            if(kk < 0){
                                kk = - kk -1;
                            }
                        }

                        next[jj][kk] += map[j][k];
                    }
                }

//                debug(next);

                map = next;
            }

            for(int i = 0;i < p;i++){
                int x = sc.nextInt();
                int y = sc.nextInt();

                System.out.println(map[x][y]);
            }
        }
    }

    void debug(int[][] a){
        System.out.println();
        for(int i =0 ;i < a.length ; i++){
            for(int j = 0 ;j < a[i].length; j++){
                System.out.print("\t"+a[i][j]);
            }
            System.out.println();
        }
    }
}


