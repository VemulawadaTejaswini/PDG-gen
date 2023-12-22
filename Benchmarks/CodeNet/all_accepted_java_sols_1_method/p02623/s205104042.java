
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[m];

		long sumA[] = new long[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();

			sumA[i] = a[i];
			if(i != 0){
				sumA[i] += sumA[i - 1];
			}

//			System.out.print(sumA[i] +" ");
		}
//		System.out.println();

		long sumB[] = new long[m];
		for(int i = 0; i < m; i++){
			b[i] = sc.nextInt();
			sumB[i] = b[i];
			if(i != 0){
				sumB[i] += sumB[i - 1];
			}
//			System.out.print(sumB[i] +" ");
		}
//		System.out.println();

		int result = 0;
		for(int i = 0; i < n; i++){
			if(sumA[i] > k){
				break;
			}

			long remain = k - sumA[i];

			int index = Arrays.binarySearch(sumB, remain);

//			System.out.println(remain+" "+index);

			if(index < 0){
				index = -index - 2;
			}

			result = Math.max(result, i + 1 + index + 1);
		}

		for(int i = 1; i <= m; i++){
			if(sumB[i - 1] <= k){
				result = Math.max(result, i);
			}
		}
		System.out.println(result);

//		long sum = 0;
//		int indexA = 0;
//		int indexB = 0;
//		int count = 0;
//		while (sum <= k && (indexA < n || indexB < m)){
//			if(indexA == n){
//				sum += b[indexB];
//				indexB++;
//			}
//			else if(indexB == m){
//				sum += a[indexA];
//				indexA++;
//			}
//			else if(a[indexA] <= b[indexB]){
//				sum += a[indexA];
//				indexA++;
//			}
//			else {
//				sum += b[indexB];
//				indexB++;
//			}
//
////			System.out.println("A "+indexA+" B "+indexB+" sum "+sum);
//			if(sum <= k){
//				count++;
//			}
//		}
//
//		System.out.println(count);
	}
}