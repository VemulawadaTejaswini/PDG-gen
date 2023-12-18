
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();

        int result = m * m;
        //创建盘子 外围都是0 内层是123456排列
        int wowo_temp = 1;
        int[][] arr = new int[m + 2][m + 2];
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                arr[i][j] = wowo_temp++;
            }
        }

        for (int i = 0; i < m + 2; i++) {
            arr[0][i] = 0;
            arr[m + 1][i] = 0;
        }
        for (int i = 0; i < m + 2; i++) {
            arr[i][0] = 0;
            arr[i][m + 1] = 0;
        }

        LOOP:
        for (int i = 0; i < m * m; i++) {
/*
            for(int j=0;j<m+2;j++){
                for(int l=0;l<m+2;l++) {
                    System.out.print(arr[j][l] + " ");
                }
                System.out.println();
            }
            System.out.println(result);
            System.out.println();*/

            int tmp = in.nextInt();
            int row = tmp / m + 1;
            int col = tmp % m;
            //得到行列数        这人出去后 将他设为0 别人可以从这里通过
            if (tmp % m == 0)
                col = m;

            arr[row][col] = 0;

            for (int k = row ; k < m + 2; k++) {
                if (arr[k][col] == 0 && k == m ) {
                    result--;
                    continue LOOP;
                }
                if(arr[k][col]!=0)
                    break ;
            }

            for (int k = row ; k > 0; k--) {
                if (arr[k][col] == 0 && k == 1) {
                    result--;
                    continue LOOP;
                }
                if(arr[k][col]!=0)
                    break ;
            }

            for (int k = col ; k < m + 2; k++) {
                if (arr[row][k] == 0 && k == m ) {
                    result--;
                    continue LOOP;
                }
                if(arr[row][k]!=0)
                    break ;
        }

            for (int k = col ; k > 0; k--) {
                if (arr[row][k] == 0 && k == 1) {
                    result--;
                    continue LOOP;
                }
                if(arr[row][k]!=0)
                    break ;
            }

        }
        System.out.println(result);
    }
}