import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r, c;
        r = scan.nextInt();
        c = scan.nextInt();
        int a[][] = new int[r + 1][c + 1];
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = scan.nextInt();
                a[r][j] += a[i][j];
                a[i][c] += a[i][j];
                a[r][c] += a[i][j];
            }
        }
        for(int i = 0; i < r + 1; i++){
            for(int j = 0; j < c + 1; j++){
                System.out.print(a[i][j]);
                if(j == c) System.out.println();
                else System.out.print(" ");
            }
        }
    }
}

