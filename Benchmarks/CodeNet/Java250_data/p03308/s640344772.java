
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] A=new int[N];
		for(int i=0; i<N; i++) {A[i]=0;}
		for(int i=0; i<N; i++) {A[i]=sc.nextInt();}
		int max=0,min=-1;
		for(int i=0; i<N; i++) {
			if(A[i]>max)max=A[i];
			if(min==-1||A[i]<min)min=A[i];
		}
		System.out.println((max-min));
	}
}