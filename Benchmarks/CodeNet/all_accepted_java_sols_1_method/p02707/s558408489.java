import java.util.Scanner;
public class Main {
	static int N;
	static int[] A;
	static int[] num;
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		A=new int[N-1];
		num=new int[N];
		for(int i=0;i<N;i++) {
			num[i]=0;
		}
		for(int i=0;i<N-1;i++) {
			A[i]=sc.nextInt();
			num[A[i]-1]++;
		}
		for(int i=0;i<N;i++) {
			System.out.println(num[i]);
		}
	}
}
