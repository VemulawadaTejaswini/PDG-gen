import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long r = sc.nextInt();
		long d=sc.nextInt();

		long x[]=new long[11];
		x[0]=sc.nextInt();

		for(int i=1;i<=10;i++){
			x[i]=x[i-1]*r-d;
		System.out.println(x[i]);
		}

	}}