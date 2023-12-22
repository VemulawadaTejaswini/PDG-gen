import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0)break;
			int[] p = new int[n];
			
			for(int i=0;i<n;i++){
				p[i] = sc.nextInt();
			}
			Arrays.sort(p);
			
			int sum = 0;
			int count = 0;
			for(int i=n-1;i>=0;i--){
				if(count==m-1){
					count=0;
				}else{
					sum += p[i];
					count++;
				}
			}
			System.out.println(sum);
		}
	}	
}