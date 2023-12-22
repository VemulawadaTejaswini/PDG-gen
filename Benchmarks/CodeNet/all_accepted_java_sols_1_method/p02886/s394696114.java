import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] dep = new int[n];
		long sum=0;
		
		for (int i=0;i<n;i++){
			dep[i]=sc.nextInt();
		}
		
		for(int s=0;s<n;s++){
			for(int t=s+1;t<n;t++){
				sum += dep[s] * dep[t];
			}
		}
		
		System.out.print(sum);
	}
}