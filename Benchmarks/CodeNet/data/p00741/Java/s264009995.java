import java.util.Scanner;

public class Main {
private static int[][]daoyu;
private static int count;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int x = input.nextInt();
            int y = input.nextInt();
            if (x == 0 && y == 0) {
            	break;
            	}
            daoyu = new int [x+2][y+2];
            for(int i = 1;i<=x;i++) {
            	for(int j = 1;j<=y;j++) {
            		daoyu[i][j]=input.nextInt();
            		}
            }
            for (int i=0; i<x+2; i++){
            	daoyu[i][0] = daoyu[i][y+1] = 0;
         
            for (int j=0; j<y+2; j++){
            	daoyu[0][j] = daoyu[x+1][j] = 0;
 
            count = 0;
            }
        }
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <=y; j++) {
                if (daoyu[i][j] == 1) {
                    count++;
                    lj(i, j);
                }
            }
        } 
        System.out.println(count);
        daoyu=null;
    }
    }
    private static void lj(int i, int j) {
    	 daoyu[i][j] = 2;
         if (i - 1 >= 0 && daoyu[i - 1][j] == 1)
             lj(i - 1, j);//上
         if (i - 1 >= 0 && j-1>=0 && daoyu[i - 1][j-1] == 1)
             lj(i - 1, j-1);//左上
         if (i - 1 >= 0 && j+1<daoyu[i].length && daoyu[i - 1][j] == 1)
             lj(i - 1, j+1);//右上
         if (i + 1 < daoyu.length && daoyu[i + 1][j] == 1)
             lj(i + 1, j);//下
         if (i + 1 < daoyu.length && j-1>=0 && daoyu[i + 1][j-1] == 1)
             lj(i + 1, j-1);//左下
         if (i + 1 < daoyu.length && j+1<daoyu[i].length &&daoyu[i + 1][j+1] == 1)
             lj(i + 1, j+1);//右下
         if (j - 1 >= 0 && daoyu[i][j - 1] == 1)
             lj(i, j - 1);//左
         if (j + 1 < daoyu[i].length && daoyu[i][j + 1] == 1)
             lj(i, j + 1);//右
     }
 
}
