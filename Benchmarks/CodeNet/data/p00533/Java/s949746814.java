import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] A;
        A = new int[H][W];
        for(int i=0; i<H; i++){
            char[] JOI = sc.next().toCharArray();
            int time = -1;
            for(int j=0; j<W; j++){
                if(JOI[j] == 'c') time = 0;
                A[i][j] = time;
                if(time>-1) time++;
            }
        }
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                System.out.print(A[i][j]);
                if(j<W-1) System.out.print(" ");
                else System.out.println();
            }
        }
    }