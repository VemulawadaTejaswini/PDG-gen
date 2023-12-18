
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		long sum,max;
		int n,a[];
		while(true){
			n=sc.nextInt();
			if(n==0) break;
			a=new int[n];
			max=-10000000;
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++){
				for(int j=n;0<=j;j--){
					sum=0;
					for(int k=i;k<j;k++){
						sum+=a[k];
					}
					if(max<sum){
						max=sum;
					}
				}
			}
			System.out.println(max);
		}
	}
}