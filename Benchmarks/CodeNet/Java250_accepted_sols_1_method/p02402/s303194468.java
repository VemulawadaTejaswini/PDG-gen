import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a =sc.nextInt();
		int Max=a;
		int min=a;
		long sum=a;
		for(int i=0;i<n-1;i++){
		int b=sc.nextInt();
		sum += b;
		if(Max<b) Max=b;
		if(min>b) min=b;
		}
		System.out.println(min+" "+Max+" "+sum);
	}
}