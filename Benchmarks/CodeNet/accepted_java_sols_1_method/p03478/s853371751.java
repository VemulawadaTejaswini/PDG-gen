import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int sum,SUM=0;
		double a,t;
		for(int i=1;i<=N;i++) {
			sum = (i/10000) + (i%10000)/1000 + (i%1000)/100 + (i%100)/10 +i%10;
			if(sum>=A && sum<=B) SUM+=i;
		}
		System.out.println(SUM);
	}

}
