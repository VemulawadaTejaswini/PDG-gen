import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int num, n, i, j;
        int a[][] = new int[4][13];
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(i = 0; i < 4; i++){
            for(j = 0; j < 13; j++){
                a[i][j] = j + 1;
            }
        }
        for(i = 0; i < n; i++){
            String ca = scan.next();
            num = scan.nextInt();
            if(ca.equals("S")) a[0][num - 1] = 0;
            if(ca.equals("H")) a[1][num - 1] = 0;
            if(ca.equals("C")) a[2][num - 1] = 0;
            if(ca.equals("D")) a[3][num - 1] = 0;
        }
        for(i = 0; i < 4; i++){
            for(j = 0; j < 13; j++){
                if(a[i][j] != 0){
                    if(i == 0) System.out.printf("S %d\n", a[i][j]);
                    if(i == 1) System.out.printf("H %d\n", a[i][j]);
                    if(i == 2) System.out.printf("C %d\n", a[i][j]);
                    if(i == 3) System.out.printf("D %d\n", a[i][j]);
                }
            }
        }
        scan.close();
    }
}

