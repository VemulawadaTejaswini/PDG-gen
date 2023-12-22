import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g[] = new int[n];
        for(int i = 0;i<n;i++){
            int k = sc.nextInt();
            g[k-1] = i+1;
        }
        for(int i = 0;i<n;i++){
            System.out.print(g[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}