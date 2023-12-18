import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] m = new int[n];
        int ans = 0;
        
        m[0] = sc.nextInt();
        x = x-m[0];
        int min = m[0];
        
        for(int i=1; i<n; i++){
            m[i] = sc.nextInt();
            x = x-m[i];
            if(min>m[i]){
                min = m[i];
            }
        }
        
        ans = x/min + n;
        
		System.out.println(ans);
    }
}
