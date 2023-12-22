import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] abc = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		int k = sc.nextInt();

		int max = 0;
		int maxIndex = 0;
		for(int i = 0; i < 3;i++){
			if(max < abc[i]){
				maxIndex = i;
				max = abc[i];
			}
		}

		int ans = 0;
		for(int i = 0; i < 3; i++){
			if(i == maxIndex){
				int a = abc[i];
				for(int x = 0; x < k; x++){
					a = a * 2;
				}
				ans += a;
			}else{
				ans += abc[i];
			}
		}
		System.out.println(ans);

	}
}
