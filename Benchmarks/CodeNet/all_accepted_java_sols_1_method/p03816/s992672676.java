import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner io = new Scanner(System.in);	
		int N = io.nextInt();
		boolean[] val = new boolean[100000];
		int A;
		long fl=0;
		for (int i = 0; i < N; i++) {
			A = io.nextInt();
			if(val[A-1]){
				fl++;
			}else{
				val[A-1]=true;
			}
		}
		System.out.println((fl%2==0)?N-fl:N-fl-1);
	}
}