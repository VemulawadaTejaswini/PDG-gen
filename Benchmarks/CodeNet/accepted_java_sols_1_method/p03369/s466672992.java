import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int ans = 700;

		for (int i = 0; i < 3; i++){
			if(S.charAt(i) == 'o'){
				ans += 100;
			}	
		}
		
		// 出力
		System.out.println(ans);
	}
}
