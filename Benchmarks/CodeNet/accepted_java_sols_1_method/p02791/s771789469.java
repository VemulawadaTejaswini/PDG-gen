import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[n];
		int sum=0;
		int min=999999999;
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
			if(min>=x[i])
				sum++;
			if(x[i]<min)
				min=x[i];
			
			
		}
		System.out.print(sum);
	}
} 