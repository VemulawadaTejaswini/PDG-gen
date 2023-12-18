import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sum=0;
		int a = sc.nextInt();
		for(int b=100;b>=1;b/=10) {
			if(a/b==1) {
			  sum+=1;
			  a=a-b*(a/b);
			}
		}
		System.out.printf("%d\n",sum);
		
		}
	}
