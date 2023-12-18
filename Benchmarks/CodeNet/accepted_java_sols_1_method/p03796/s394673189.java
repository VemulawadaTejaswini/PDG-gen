import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long start=1;
		for (int i=1;i<=N;i++) {
			start=(start*i)%1000000007l;
		}
		System.out.println(start);
	}
}