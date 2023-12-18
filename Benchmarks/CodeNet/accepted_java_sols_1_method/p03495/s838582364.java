import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int[] x=new int[n+1];
		int sum = 0;
		for(int i=0;i<n;i++){
			x[sc.nextInt()]++;
		}
		Arrays.sort(x);
		for(int i=n-k;i>=0;i--){
			sum+=x[i];
		}
		System.out.print(sum);
	}
}
