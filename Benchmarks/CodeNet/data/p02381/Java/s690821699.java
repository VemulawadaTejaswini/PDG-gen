import java.util.Scanner;
import java.lang.Math;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int sum = 0;
			int a = 0;
			int s[] = new int[n];
			for(int i=0; i<n; i++){
				s[i] = sc.nextInt();
				sum+=s[i];
			}
			for(int i=0; i<n; i++){
				a += Math.pow(s[i]-sum/n,2);
			}
			System.out.println(Math.sqrt(a/n));
		}
	}
}