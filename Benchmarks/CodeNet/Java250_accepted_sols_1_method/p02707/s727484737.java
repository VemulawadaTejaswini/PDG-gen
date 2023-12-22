import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N-1];
		int[] count = new int[N];
		Arrays.fill(count, 0);
		for(int i = 0;i < N-1;i++){
			A[i] = sc.nextInt();
		}
		sc.close();
		count[0]++;
		for(int i = 1;i < N-1;i++){
			if(A[i-1]==A[i]){
				count[A[i-1]-1]++;
			}else{
				count[A[i]-1]++;
			}
		}
		for(int num : count){
			System.out.println(num);
		}
	}

}