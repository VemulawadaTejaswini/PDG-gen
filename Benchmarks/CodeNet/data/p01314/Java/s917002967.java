import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();

	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 0){
			
			int count = 0;
			for(int i = 1; i < n/2 + 1; i++){
				if(checkFromN(i, n)){
					count++;
				}
			}
			System.out.println(count);
			n =sc.nextInt();
		}

	}
	
	//ansと一致したらtrue
	public static boolean checkFromN(int n, int ans){
		int sum = n;
		for(int j = n+1; j < ans/2 + 2; j++){
			sum += j;
			if(sum == ans){
				return true;
			}
			else if(sum > ans){
				break;
			}
		}
		return false;
	}

}