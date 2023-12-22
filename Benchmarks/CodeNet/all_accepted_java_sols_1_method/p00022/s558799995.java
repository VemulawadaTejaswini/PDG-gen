import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			int dataset = scanner.nextInt();
			if(dataset == 0){
				break;
			}
			int[] input = new int[dataset];
			for(int i=0; i<dataset; i++){
				input[i] = scanner.nextInt();
			}
			int[] ans = new int[dataset];
			for(int i=0; i<dataset; i++){
				int[] tmpi = new int[dataset-i];
				for(int j=0; j<dataset-i; j++){
					int tmp_sum = 0;
					for(int k=0; k<=j; k++){
						tmp_sum += input[i+k];
					}
					tmpi[j] = tmp_sum;
//					System.out.println("tmpi[" + j + "]" + tmpi[j]);
				}
				Arrays.sort(tmpi);
				ans[i] = tmpi[tmpi.length-1];
//				System.out.println(i + "の最大値" + tmpi[tmpi.length-1]);
			}
			Arrays.sort(ans);
			System.out.println(ans[ans.length-1]);
		}
	}
}