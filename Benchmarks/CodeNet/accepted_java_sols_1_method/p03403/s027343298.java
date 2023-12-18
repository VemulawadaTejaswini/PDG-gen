import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		long sum = Math.abs(a[0])+ Math.abs(a[n-1]);
		for(int i=1;i<n;i++){
			sum+=Math.abs(a[i]-a[i-1]);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(sum-Math.abs(a[0])-Math.abs(a[1]-a[0]) + Math.abs(a[1])+"\n");
		for(int i=1;i<n-1;i++){
			sb.append(sum-Math.abs(a[i]-a[i-1])-Math.abs(a[i+1]-a[i])+Math.abs(a[i+1]-a[i-1])+"\n");
		}
		sb.append(sum-Math.abs(a[n-1])-Math.abs(a[n-2]-a[n-1]) + Math.abs(a[n-2])+"\n");
		System.out.print(sb);
	}
}