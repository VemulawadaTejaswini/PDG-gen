import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int b[] = new int[n+1];
        b[0] = 114514; b[n] = 114514;
        
        for(int i=1; i<n; i++) 
        	b[i] = Integer.parseInt(sc.next());
        int ans = 0;
        for(int i=0; i<n; i++)
            ans += (Math.min(b[i],b[i+1]));
        System.out.println(ans);
    }
}