import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {

		List<Integer> array = new ArrayList<>();


		Scanner scan = new Scanner(System.in);
		int N  = scan.nextInt();
		int[] ans  = new int[N+1];

		array.add(1);

		for(int i=6; i <=N; i *= 6){
			array.add(i);
		}

		for(int i=9; i <=N; i *= 9){
			array.add(i);
		}

		Collections.sort(array);

		for(int i = 0; i<=N; i++){
			ans[i] = 100000;
		}

		ans[0] = 0;

		for(int i = 1; i<= N;i++){
			for(int j: array){
				if(i < j) break;
				ans[i] = Math.min(ans[i], ans[i-j]+1);
			}
		}



		System.out.println(ans[N]);


	}


}