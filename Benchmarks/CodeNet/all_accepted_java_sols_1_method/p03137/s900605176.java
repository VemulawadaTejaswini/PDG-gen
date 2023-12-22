import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        if(n>=m){
            System.out.println(0);
        }else{
            int[] x = new int[m];
            for(int i=0;i<m;i++)x[i] = Integer.parseInt(sc.next());
            Arrays.sort(x);
            int[] diff = new int[m-1];
            for(int i=0;i<m-1;i++)diff[i] = -(x[i+1] - x[i]);

            Arrays.sort(diff);
            int dist = x[m-1] - x[0];
            for(int i=0;i<n-1;i++)dist+=diff[i];
            System.out.println(dist);
        }
        sc.close();
    }
}