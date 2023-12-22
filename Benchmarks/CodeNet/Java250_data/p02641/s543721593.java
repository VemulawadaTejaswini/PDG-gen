import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] d = new int[102];
        for(int i=0; i<=101; i++){
            d[i]=i;
        }
        
        for(int i = 0; i<n;i++) {
        	p[i] = sc.nextInt();
        	d[p[i]]=-1;
        }
        
        
        
        
        int min = 99999;
        int ans = 0;
        if(n==0) ans = x;
        for(int i=0; i<=101; i++){
            if(d[i] != -1) {
            	if(Math.abs(i-x) < min ) {
            		ans = i;
            		min = Math.abs(i-x);
            	}
            }
            
        }
        
        
        System.out.print(ans);
        
	}
}