import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];
			
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				b[i] = sc.nextInt() + sc.nextInt();
			}
			
			c = Arrays.copyOf(b, n);
			Arrays.sort(b);
			
			for(int i=0;i<n;i++){
				if(c[i]==b[n-1])System.out.println(a[i] + " " + b[n-1]);
			}	
		}
	
	}	
}