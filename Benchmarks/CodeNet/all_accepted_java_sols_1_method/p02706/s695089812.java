import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[M];
		int sumday = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sumday += arr[i];
		}

		if (sumday>N) {
			System.out.println(-1);
		} else {
			System.out.println(N-sumday);
		}
		sc.close();
    }	
		
}