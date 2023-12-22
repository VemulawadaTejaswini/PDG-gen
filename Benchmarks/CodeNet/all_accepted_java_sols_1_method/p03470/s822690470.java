import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for(int i=0; i<n; i++){
            d[i] = sc.nextInt();
        }
        sc.close();
        
        boolean[] b = new boolean[200];
        Arrays.fill(b, false);
        
        int ans = 0;
        for(int i=0; i<n; i++){
            if(!b[d[i]]){
                b[d[i]] = true;
                ans++;
            }
        }

        System.out.print(ans);
	}
}