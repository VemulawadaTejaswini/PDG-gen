import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int Asum=0;
		for(int i=1;i<=a;i++) {
			int sum=0;
			for(int j=i;j>0;j/=10) {
			   int d=j%10;
			   sum+=d;
			 }
			 if(b<=sum&&sum<=c)Asum+=i;
		}
		System.out.println(Asum);
	}
}