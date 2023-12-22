import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		long l[]=new long[n+1];
		l[0]=2;
		l[1]=1;
		for(int i=2;i<=n;i++) {
			l[i]=l[i-1]+l[i-2];
		}
		System.out.println(l[n]);
		//System.out.println(func(n));
	}

	/*
	static long func(int n) {
		if(n==0)return 2;
		if(n==1)return 1;
		return func(n-1)+func(n-2);
	}*/
}