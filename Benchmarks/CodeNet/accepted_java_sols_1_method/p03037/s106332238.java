import java.util.Scanner;
 
public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int min = 0;
        int max = n;
        for(int i = 0; i < m; i++) {
        	int l = sc.nextInt();
        	int r = sc.nextInt();
        	min = Math.max(min, l);
        	max = Math.min(r, max);
        }
        int ans = max - min + 1;
        if(ans > 0) {
        	System.out.println(ans);
        }else {
        	System.out.println(0);
        }
    }
}