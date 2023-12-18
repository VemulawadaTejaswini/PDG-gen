import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n+1];
        for(int i=0; i<n; i++){
            int s = sc.nextInt();
            a[s]++;
        }
        Arrays.sort(a);
        int ans = 0;
        for(int i=0; i<a.length-k; i++){
            ans += a[i];
        }
        System.out.println(ans);
    }
    
}