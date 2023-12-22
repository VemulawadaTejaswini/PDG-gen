import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int ans = 0;

		for(int i = 1; i<10; i++){
			int a = 111;
			if((a*i) >= N){
				ans = a*i;
				break;
			}
		}

		System.out.println(ans);


	}
}