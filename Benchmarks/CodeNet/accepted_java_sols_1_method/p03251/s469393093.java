import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] xx = new int[n + 1];
        int[] yy = new int[m + 1];
        for(int i = 0;i < n;i ++){
            xx[i] = sc.nextInt();
        }
        xx[n] = x;
        for(int i = 0; i < m;i ++){
            yy[i] = sc.nextInt();
        }
        yy[m] = y;
        Arrays.sort(xx);
        Arrays.sort(yy);
        boolean flag = false;
        if(xx[n] < yy[0]){
        flag = true;
        }
        System.out.println(flag ? "No War" : "War");
    }
}