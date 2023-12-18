import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] count = new int[N];
        
        for(int m=0;m<M;m++){
        	count[sc.nextInt()-1]++;
        	count[sc.nextInt()-1]++;
        }
        
        boolean ans = true;
        for(int n=0;n<N;n++){
        	if(count[n]%2!=0) ans = false;
        }
        
        if(ans) System.out.println("YES");
        else System.out.println("NO");
    }
}