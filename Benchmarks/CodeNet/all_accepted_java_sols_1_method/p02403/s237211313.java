import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        int[] H;
        int[] W;
        H = new int[100000];
        W = new int[100000];
        int i, j, k, l;
        int count = 0;
    Scanner sc = new Scanner(System.in);
        for(i=1;i<100000;i++){
        int h = sc.nextInt();
        int w = sc.nextInt();
        H[i] = h;
        W[i] = w;
        if (H[i]==0 && W[i]==0) break;
        count++;
        }

        for (j=1;j<=count;j++){
            for (k=1;k<=H[j];k++){
                for (l=1;l<=W[j];l++){
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
