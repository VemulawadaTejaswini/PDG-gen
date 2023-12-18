import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        for(int i = 0;i<n;i++){
            t[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int [][] px = new int[m][2];
        for(int i = 0;i<m;i++){
            px[i][0] = sc.nextInt();
            px[i][1] = sc.nextInt();
        }
        int goukei = 0;
        for(int i = 0;i<n;i++){
            goukei += t[i];
        }
        for(int i = 0;i<m;i++){
            System.out.println((goukei - t[px[i][0]-1] + px[i][1]));
        }
        sc.close();
    }
}