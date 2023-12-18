import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int xi[] = new int[n];
        int yi[] = new int[m];
        for(int i = 0; i < n; i++){
            xi[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            yi[i] = sc.nextInt();
        }
        int xmax = -100;
        for(int i = 0; i < n; i++){
            xmax = Math.max(xi[i], xmax);
        }
        int ymin = 100;
        for(int i = 0; i < m; i++){
            ymin = Math.min(yi[i], ymin);
        }
        if (x < y) {
            if (xmax < ymin && xmax < y && ymin > x) {
                System.out.println("No War");
            }
            else{
                System.out.println("War");
            }
        }else{
            System.out.println("War");
        }
    }
}