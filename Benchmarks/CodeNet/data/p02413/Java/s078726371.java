import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        int i,j;
        int[][] array = new int[r + 1][c + 1];
        
        for(i = 0; i < r; i++){
            for(j = 0; j < c; j++){
                array[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i < r; i++){
            for(j = 0; j < c; j++){
                array[i][c] += array[i][j];
            }
        }
        for(i=0; i<c+1; i++){
            for(j=0; j<r; j++){
                array[r][i] += array[j][i];
            }
        }
        for(i=0; i<r+1;i++){
            for(j=0; j<c+1; j++){
                if(j==c)System.out.print(array[i][j]);
                else System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
