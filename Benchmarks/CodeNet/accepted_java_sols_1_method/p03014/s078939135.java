import java.util.Scanner;

class Main {
    static int h,w;
    static char[][] grid;
    static int[][] count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = Integer.parseInt(sc.next());
        w = Integer.parseInt(sc.next());
        grid = new char[h][w];
        count = new int[h][w];
        int offset = 0;
        int cnt = 0;
        for(int i=0;i<h;i++){
            grid[i] = sc.next().toCharArray();
            cnt = 0;
            offset = 0;
            for(int j=0;j<w;j++){
                if(grid[i][j]=='.'){
                    cnt++;
                }else{
                    for(int k=offset;k<j;k++){
                        count[i][k] += cnt;
                    }
                    offset = j+1;
                    cnt = 0;
                }
            }
            for(int k=offset;k<w;k++){
                count[i][k] = cnt;
            }
        }
        int max = 0;
        for(int i=0;i<w;i++){
            cnt  = 0;
            offset = 0;
            for(int j=0;j<h;j++){
                if(grid[j][i]=='.'){
                    cnt++;
                }else{
                    for(int k=offset;k<j;k++){
                        count[k][i] += cnt;
                        max = Math.max(max, count[k][i]);
                    }
                    offset = j+1;
                    cnt = 0;
                }
            }
            for(int k=offset;k<h;k++){
                count[k][i] +=cnt;
                max = Math.max(max, count[k][i]);
            }
        }
        System.out.println(max-1);
        sc.close();
    }

    
}