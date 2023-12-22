import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] skewer = new int[2*N];
        for(int n=0;n<2*N;n++) skewer[n]=sc.nextInt();
        Arrays.sort(skewer);
        int ans = 0;
        for(int n=0;n<N;n++){
        	ans += skewer[2*n];
        }
        System.out.println(ans);
    }
}