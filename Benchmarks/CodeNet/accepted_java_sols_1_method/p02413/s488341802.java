import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] Table = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                Table[i][j] = sc.nextInt();
            }
        }
        int[] gyouTotal = new int[r];
        int[] retsuTotal = new int[c];
        int total = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                gyouTotal[i] += Table[i][j];
            }
        }
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                retsuTotal[i] += Table[j][i];
            }
        }
        for(int i=0; i<c; i++){
            total += retsuTotal[i];
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(Table[i][j] + " ");
            }
            System.out.println(gyouTotal[i]);
        }
        for(int i=0; i<c; i++){
            System.out.print(retsuTotal[i] + " ");
        }
        System.out.println(total);

    }
}
