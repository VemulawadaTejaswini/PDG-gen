import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[2 * N];
		for(int i = 0;i < 2 * N; i++){
			L[i] = sc.nextInt();
		}
		Arrays.sort(L);
		int i = 0;
		int returnValue = 0;
		while(true){
			returnValue += L[i];
//			System.out.println(i + " " + L[i]);
			i = i + 2;
			if(i == 2 * N){
				break;
			}

		}
		System.out.println(returnValue);
	}

}
