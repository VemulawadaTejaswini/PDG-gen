import java.util.Scanner;


public class Main {
	static int[] max;
	static int num;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(read()){
			solve();
		}

	}

	public static boolean read(){
		num = sc.nextInt();
		if(num == 0) return false;

		max = new int[num];

		for(int i=0; i<num; i++){
			for(int j=0; j<5; j++){
				max[i] += sc.nextInt();
			}
		}

		return true;
	}

	public static void solve(){
		int min_sum = 600;
		int max_sum = 0;

		for(int i=0; i<num; i++){

			if(max[i] < min_sum){
				min_sum = max[i];
			}

			if(max[i] > max_sum){
				max_sum = max[i];
			}
		}

		System.out.println(max_sum + " " + min_sum);

	}

}