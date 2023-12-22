import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N-1];
		int[] count = new int[N];
		for(int i = 0;i < N-1;i++){
			A[i] = sc.nextInt();
		}
		for(int i = 0;i < N-1;i++){
			count[A[i]-1]++;
		}
		for(int num : count){
			System.out.println(num);
		}
		sc.close();

	}

}