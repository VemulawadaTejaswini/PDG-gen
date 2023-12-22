import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] p = new int[N];
		for(int i=0;i<N;i++) {
			p[i] = scan.nextInt();
		}
		Arrays.sort(p);
		int Sum = 0;
		int i = 0;
		for(i=0;i<N-1;i++) {
			Sum += p[i];
		}
		Sum += p[i]/2;
		System.out.println(Sum);
	}
}