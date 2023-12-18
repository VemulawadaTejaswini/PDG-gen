import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			if(N == 0 || M == 0){
				break;
			}
			
			int[] array_1 = new int[N];
			for(int i = 0; i < N; i++){
				array_1[i] = sc.nextInt();
			}
			
			Arrays.sort(array_1);
			
			int[] array_2 = new int[((N + 1) * N) / 2];
			int count = 0;
			for(int i = 0; i < N; i++){
				for(int j = i; j < N; j++){
					array_2[count] = array_1[i] + array_1[j];
					count++;
				}
			}
			
			Arrays.sort(array_2);
			
			int max = 0;
			for(int i = 0; i < N; i++){
				max = Math.max(max, array_1[i] <= M ? array_1[i] : 0);
			}
			
			for(int i = 0; i < array_2.length; i++){
				int rest = M - array_2[i];
				
				int pos1 = Arrays.binarySearch(array_1, rest);
				if(pos1 < 0){
					pos1 = - (pos1 + 2);
				}
				
				if(pos1 >= 0){
					max = Math.max(max, array_2[i] + array_1[pos1]);
				}
				
				int pos2 = Arrays.binarySearch(array_2, rest);
				if(pos2 < 0){
					pos2 = - (pos2 + 2);
				}
				
				if(pos2 >= 0){
					max = Math.max(max, array_2[i] + array_2[pos2]);
				}
			}
			
			System.out.println(max);
		}
	}

}