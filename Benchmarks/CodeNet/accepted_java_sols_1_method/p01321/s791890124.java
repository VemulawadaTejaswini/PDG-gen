import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				for(int j=0;j<5;j++){
					a[i] += sc.nextInt();
				}
			}
			Arrays.sort(a);
			System.out.println(a[n-1] + " " + a[0]);
			
		}
	}	
}