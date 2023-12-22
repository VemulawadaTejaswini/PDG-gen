import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] S = new int[N];
		int min = 1000;
		int sum = 0;
		for(int i = 0 ; i < N ; i++){
			S[i] = sc.nextInt();

			if(S[i]%10!=0){
				min = Math.min(min, S[i]);
			}

			sum+=S[i];
		}


		if(sum%10 != 0){
			System.out.println(sum);
		}
		else if(sum%10 == 0 && min != 1000){
			System.out.println(sum-min);
		}
		else{
			System.out.println(0);
		}
		sc.close();


	}
}
