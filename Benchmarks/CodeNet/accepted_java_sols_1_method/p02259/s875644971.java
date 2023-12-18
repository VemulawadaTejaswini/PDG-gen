import java.util.*;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt();
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) A[i] = sc.nextInt();
		
		boolean flag = true;
		int temp, count = 0;
		
		while(flag){
			flag = false;
			for(int i = N - 1; i > 0; i--){
				if(A[i] < A[i - 1]){
					temp = A[i - 1];
					A[i - 1] = A[i];
					A[i] = temp;
					flag = true;
					count++;
				}
			}
		}
		System.out.print(A[0]);
		for(int i = 1; i < N; i++) System.out.print(" " + A[i]);
		System.out.println();
		System.out.println(count);
	}
}
