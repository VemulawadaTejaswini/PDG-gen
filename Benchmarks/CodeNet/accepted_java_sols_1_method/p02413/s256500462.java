import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int rc[][] = new int[r][c];
        int c_total = 0;
        int r_total[] = new int[c + 1];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int num = sc.nextInt();
                rc[i][j] = num;
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                c_total += rc[i][j];
                r_total[j] += rc[i][j];
                System.out.print(rc[i][j]);
                System.out.print(" ");
            }
            r_total[c] += c_total;  
            System.out.println(c_total);
            c_total = 0;
        }
        for(int i = 0; i < c + 1; i++){
        System.out.print(r_total[i]);
        if(i != c){
            System.out.print(" ");
        }
        }
        System.out.println("");
    }
}