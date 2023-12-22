import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int x = scan.nextInt();
        int[] a = new int[m];
        int g1 = 0;
        int g2 = 0;
        for(int i = 0; i < m; i++){
            a[i] = scan.nextInt();
            if(a[i] < x) g1++;
            else g2++;
        }
        System.out.println((int)(Math.min(g1, g2)));
        scan.close();
    }
}