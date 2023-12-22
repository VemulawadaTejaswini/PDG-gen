import java.util.Scanner;
public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int ans = Integer.MAX_VALUE;
		for(int i = 0 ; i < a ; i++){
			long temp = scan.nextLong();
			int cnt = 0;
			while(true){
				if(temp % 2 == 0){
					temp = temp / 2;
					cnt ++;
				}else{
					break;
				}
			}
			if(cnt < ans){
				ans = cnt;
			}
		}
		System.out.println(ans);
	}
}