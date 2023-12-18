import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] info = new int[12][40];
        int b,f,r,v;
        for(int i = 0;i<n;i++){
            b = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
            v = sc.nextInt();
            info[(b-1)*3+f-1][r-1] += v;
        }
        for(int i = 0;i<4;i++){
            for(int j = 0;j<3;j++){
                for(int k = 0;k<10;k++){
                    System.out.printf(" %d",info[i*3+j][k]);
                }
                System.out.println();
            }
            if(i !=3)
                System.out.printf("####################%n");
        }
        sc.close();
    }
}
