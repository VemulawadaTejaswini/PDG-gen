import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int[] x = new int[32];
        x[0] = 1;
        x[1] = 1;
        x[2] = 1;
        x[3] = 2;
        x[4] = 1;
        x[5] = 2;
        x[6] = 1;
        x[7] = 5;
        x[8] = 2;
        x[9] = 2;
        x[10] = 1;
        x[11] = 5;
        x[12] = 1;
        x[13] = 2;
        x[14] = 1;
        x[15] = 14;
        x[16] = 1;
        x[17] = 5; 
        x[18] = 1;
        x[19] = 5;
        x[20] = 2;
        x[21] = 2;
        x[22] = 1;
        x[23] = 15;
        x[24] = 2;
        x[25] = 2;
        x[26] = 5;
        x[27] = 4;
        x[28] = 1;
        x[29] = 4;
        x[30] = 1;
        x[31] = 51;

        System.out.println(x[K-1]);
    }
}