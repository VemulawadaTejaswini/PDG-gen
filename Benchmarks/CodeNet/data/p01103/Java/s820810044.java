import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] arg){
        Main m = new Main();
        m.run();
    }

    void run(){

        for(;;){
            int d=sc.nextInt();
            int w =sc.nextInt();

            if(d == 0){
                break;
            }

            int map[][] = new int[d][w];
            for(int i =0; i< d; i++){
                for(int j = 0 ; j < w; j++){
                    map[i][j] = sc.nextInt();
                }
            }

            int max = 0;
            for(int i = 0; i < d; i++){
                for(int j = 0 ; j < w; j++){
                    for(int k = i+1; k<d; k++){
                        for(int l = j+1;l < w;l++){

                            int wallsize = wall(map,i,j,k,l);
                            max = Math.max(max, size(map,i,j,k,l,wallsize));
                        }
                    }
                }
            }
            System.out.println(max);

        }
    }
    int wall(int[][] map,int i, int j , int k ,int l){
        int min = map[i][j];
        for(int x = i; x <= k; x++){
            min = Math.min(map[x][j],min);
            min = Math.min(map[x][l], min);
        }
        for(int y= j; y <= l ;y++){
            min = Math.min(map[i][y],min);
            min = Math.min(map[k][y],min);
        }
        return min;
    }

    int size(int[][]map,int i,int j,int k,int l,int w){
        int sum = 0;
        for(int x = i+1 ; x < k; x++){
            for(int y = j+1; y<l ;y++){
                if(map[x][y] >= w){
                    return 0;
                }
                sum += w-map[x][y];
            }
        }
        return sum;
    }
}

