

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

//		Vector<Integer> colorValue = new Vector<Integer>();
		int colorValue[] = new int[n];
		Arrays.fill(colorValue, Integer.MAX_VALUE);

//		colorValue.add(a[n - 1]);
		colorValue[0] = a[n - 1];
		int tail = 0;

		for(int i = n - 2; i >= 0; i--){
			//Collections.sort(colorValue);

			if(a[i] >= colorValue[tail]){
				tail++;
				colorValue[tail] = a[i];
			}
			else {
				int tmpIndex = Arrays.binarySearch(colorValue, a[i] - 1);
//				System.out.println("tmpIndex "+tmpIndex);
				if(tmpIndex < 0){
					tmpIndex = -tmpIndex - 1;
				}
				for(int j = tmpIndex; j <= tail; j++){
					if(colorValue[j] > a[i]){
						colorValue[j] = a[i];
						break;
					}
				}
			}

			//debug
//			for(int j = 0; j <= tail; j++){
//				System.out.print(colorValue[j]+" ");
//			}
//			System.out.println();
		}

		System.out.println(tail + 1);
	}

}
