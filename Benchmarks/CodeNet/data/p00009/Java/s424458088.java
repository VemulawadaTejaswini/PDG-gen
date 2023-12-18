import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static boolean p[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,count=0;
		n=sc.nextInt();
		p=new boolean[n+1];
		Arrays.fill(p, true);
		for(i=0;i<=n;i++){
			p[i]=prime(i);
		}
		for(i=0;i<=n;i++){
			if(p[i]) count++;
		}
		System.out.println(count);
	}
	static boolean prime(int n){
		int i;
		if(n==2) return true;
		if(n<=1 || n%2==0) return false;

		for(i=3;i*i<=n;i+=2){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}