import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int candy = sc.nextInt();
        int[] a = new int[N];
        for(int n=0;n<N;n++) a[n]=sc.nextInt();
        Arrays.sort(a);
        
        int ans = 0;
        for(int n=0;n<N;n++){
        	if(candy < a[n]) break;
        	if(n<N-1 || a[n]==candy){
        	    ans++;
        	    candy -= a[n];
        	}
        }
        System.out.println(ans);
        
    }
}