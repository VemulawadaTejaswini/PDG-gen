import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[n];
		long sum = 0;
		for(int i=0;i<n;i++){
			x[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				sum+=x[i]*x[j];
			}
		}
		System.out.println(sum);
	}
}
