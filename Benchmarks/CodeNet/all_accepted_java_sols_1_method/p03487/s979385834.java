import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[100001];
		int sum = 0;
		for(int i=0;i<n;i++){
			int m=sc.nextInt();
			if(m>100000){
				sum++;
			}else
				x[m]++;
		}
		for(int i=0;i<=100000;i++){
			if(x[i]<i){
				sum+=x[i];
			}
			else if(x[i]>i){
				sum+=x[i] - i;
			}
		}
		System.out.print(sum);
	}
}
