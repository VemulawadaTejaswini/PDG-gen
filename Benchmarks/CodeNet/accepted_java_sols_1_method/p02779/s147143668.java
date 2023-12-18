import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++){
			A[i]=stdIn.nextInt();
		}
		Arrays.sort(A);
		for(int i=1;i<N;i++){
			if(A[i-1]==A[i]){
				System.out.println("NO");
				System.exit(0);
			}
		}
		System.out.println("YES");
	}
}
