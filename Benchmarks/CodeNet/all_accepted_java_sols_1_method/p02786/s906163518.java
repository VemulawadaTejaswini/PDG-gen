import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		long h=sc.nextLong(),count=0,sum=1;
		while(h!=1) {
			count++;
			h/=2;
			sum+=(long)Math.pow(2, count);
		}
		System.out.println(sum);
	}
}

