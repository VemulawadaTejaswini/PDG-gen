import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int A[]=new int [N];
		A[0]=0;
		int B[]=new int [N];
		for(int i=1;i<N;i++){
			A[i] =scan.nextInt();
		}
		for(int i=1;i<N;i++){
			B[A[i]-1]+=1;
		}
		for(int i=0;i<N;i++){
			System.out.println(B[i]);
		}

	}

}
