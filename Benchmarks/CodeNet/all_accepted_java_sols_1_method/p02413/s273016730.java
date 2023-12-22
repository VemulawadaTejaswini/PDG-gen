import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] linesp = line.split(" ");
        int r = Integer.parseInt(linesp[0]);
        int c = Integer.parseInt(linesp[1]);
        int[][] mat = new int[r + 1][c + 1];
        for(int i = 0; i < r; i++) {
            String line1 = sc.nextLine();
            String[] line1sp = line1.split(" ");
            for(int j = 0; j < c; j++) {
                mat[i][j] = Integer.parseInt(line1sp[j]);
            }
        }
        int[] tatesum = new int[c];
        for(int i = 0; i < r; i++) {
            int yokosum = 0;
            for(int j = 0; j < c; j++) {
                yokosum += mat[i][j];
                tatesum[j] += mat[i][j]; 
            }
            mat[i][c] = yokosum;
        }
        int sum = 0;
        for(int j = 0; j <= c; j++) {
            if(j < c) {
                mat[r][j] = tatesum[j];
                sum += tatesum[j];
            }
            if(j == c) {
                mat[r][c] = sum;
            }
        }
        
        for(int i = 0; i <= r; i++) {
            for(int j = 0; j <= c; j++) {
                System.out.print(mat[i][j]);
                if(j < c) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
         }
        
  }
 }
