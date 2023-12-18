import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y  =sc.nextInt();
				

		int ans = 0;
		for(int i = 0;i < k;i++){
			if(i >= n){
				break;
			}
			ans += x;
		}
		
		for(int i = 0;i < n-k;i++){
			ans += y;
		}
		System.out.println(ans);
	}
}