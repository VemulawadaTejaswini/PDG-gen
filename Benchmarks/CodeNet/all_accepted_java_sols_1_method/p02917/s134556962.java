import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] B = new int[N-1];
		for(int i=0;i<N-1;i++){
			B[i] = sc.nextInt();
		}
		int result = B[0] + B[N-2];
		for(int i=0;i<N-2;i++){
			result += Math.min(B[i],B[i+1]);
		}
		System.out.println(result);
	}
}