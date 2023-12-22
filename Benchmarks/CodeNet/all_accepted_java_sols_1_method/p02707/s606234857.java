import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt();
        int n = sc.nextInt();
        int[] id = new int[n-1];
        int[] times = new int[n+1];
        //int[] d = new int[102];
        
        for(int i = 0; i<n-1;i++) {
        	id[i] = sc.nextInt();
        	times[id[i]]++;
        }
        
        for(int i = 1; i<=n; i++) {
        	System.out.println(times[i]);
        }
        
        
        
        
        
        
        
        //System.out.print(ans);
        
	}
}