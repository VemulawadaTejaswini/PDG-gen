import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong(),b=sc.nextLong(),n=sc.nextLong();
		sc.close();
		if(b<=n) System.out.println((long)a*(b-1)/b);
		else System.out.println((long)a*n/b);
	}
}