import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt() , point =sc.nextInt();
		int[] x=new int[n];
		int hat = 0;
		for(int i=0;i<n;i++){
			int a=sc.nextInt(),b=sc.nextInt();
			if(a>hat)
				hat = a;
			x[i] = b;
		}
		Arrays.sort(x);
		int sum = 0;
		for(int i=n-1;i>=0;i--){
			if(point<=0||x[i]<hat)
				break;
			else if(x[i]>hat){
				sum++;
				point-=x[i];
			}
		}
		if(point>0){
			sum+=Math.ceil((double)point/(double)hat);
		}
		System.out.print(sum);
	}
}
