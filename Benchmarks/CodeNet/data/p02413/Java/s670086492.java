
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();

        int[][] sheet = new int[r+1][c+1];

        for(int l = 0; l < (c+1); l++){
            sheet[r][l] = 0;
        }

        for(int row = 0; row < r; row++){
            sheet[row][c] = 0;
        }

        for(int f = 0; f < r; f++){
            for(int i = 0; i < c; i++){
                sheet[f][i] = scan.nextInt();

                sheet[f][c] = sheet[f][c] + sheet[f][i];
                sheet[r][i] = sheet[r][i] + sheet[f][i];
            }
            sheet[r][c] = sheet[r][c] + sheet[f][c];
        }


        for(int f = 0; f < (r+1); f++){
            for(int i = 0; i < (c+1); i++){
                System.out.print(sheet[f][i]);
                if(i != c){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}

