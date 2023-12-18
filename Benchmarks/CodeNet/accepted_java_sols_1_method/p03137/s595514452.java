import java.util.*;
import static java.lang.Math.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] X = new int[m];
        for(int i=0; i<m; i++){
            X[i] = sc.nextInt();
        }
        Arrays.sort(X);
        int[] a = new int[m-1];
        for(int i=0; i<m-1; i++){
            a[i] = X[i+1] - X[i]; 
        }
        Arrays.sort(a);
        int ans = 0;
        for(int i=0; i<m-n; i++){
            ans += a[i];
        }
        System.out.println(ans);
    }
}