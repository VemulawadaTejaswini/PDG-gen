
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];

		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		boolean[] valid = new boolean[n];
		Arrays.fill(valid, true);


		HashSet<Integer>set = new HashSet<Integer>();
		for(int i = 0; i < n; i++){


			if(set.contains(a[i])){
				valid[i] = false;
			}
			else {
				for(int j = 2 ; j <= a[i]/2; j++){
					if(a[i]%j == 0 && set.contains(j)){
						valid[i] = false;
						break;
					}
				}
			}
//			if(!valid[i]){
//				continue;
//			}
//			for(int j = i + 1; j < n; j++){
//				if(a[j] % a[i] == 0){
//					valid[j] = false;
//
//					if(a[j] == a[i]){
//						valid[i] = false;
//					}
//				}
//			}
//			int j = 2;
//			while(a[i]*j <= 1_000_000){
//				int index = Arrays.binarySearch(a, a[i]*j);
//
//				if()
//			}

			set.add(a[i]);
			if(i != n - 1 && a[i] == a[i + 1]){
				valid[i] = false;
			}
		}

//		if(n >= 2 && a[0] == a[1]){
//			valid[0] = false;
//		}

		int count = 0;
		for(int i = 0; i < n; i++){
			if(valid[i]){
//				System.out.println(a[i]);
				count++;
			}
		}

		System.out.println(count);
	}
}
