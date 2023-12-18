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
            daoyu = new int [y+2][x+2];
            for(int i = 1;i<=y;i++) {
            	for(int j = 1;j<=x;j++) {
            		daoyu[i][j]=input.nextInt();
            		}
            }
            for (int i=0; i<y+2; i++){
            	daoyu[i][0] = daoyu[i][x+1] = 0;
         
            for (int j=0; j<x+2; j++){
            	daoyu[0][j] = daoyu[y+1][j] = 0;
 
            count = 1;
            }
        }
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <=x; j++) {
                if (daoyu[i][j] == 1) {
                    count++;
                    lj(i, j);
                }
            }
        } 
        System.out.println(count-1);
        daoyu=null;
    }
    }
    private static void lj(int i, int j) {
    	 daoyu[i][j] = count;
         for(int a=-1; a<=1; a++) {
             for (int b=-1; b<=1; b++) {
                 if (daoyu[i+a][j+b] == 1) lj(i+a, j+b);
             }
         }
     }
 
}
