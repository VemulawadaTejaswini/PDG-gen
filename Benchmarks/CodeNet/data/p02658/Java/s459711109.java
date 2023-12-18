import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long num=1l;
		for(int i=0;i<N;i++) {
			num*=sc.nextLong();
		}
		sc.close();
		if (num > Long.MAX_VALUE||num>1000000000000000000l)
			System.out.println(-1);
		else
			System.out.println(num);
	}
}