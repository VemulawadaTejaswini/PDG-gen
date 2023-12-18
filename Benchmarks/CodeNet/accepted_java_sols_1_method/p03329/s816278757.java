import java.util.Scanner;
 
public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n+1;i++){
			int count =0;
			int cj = i;
			for(int j=1;j<=i;j *= 6){
				count += cj%6;
				cj = cj/6;
			}
			int ck = n-i;
			for(int k=1;k+i<=n;k *= 9){
				count += ck%9;
				ck = ck/9;
			}

			min = Math.min(min,count);

		}

		System.out.println(min);
	}
 
}