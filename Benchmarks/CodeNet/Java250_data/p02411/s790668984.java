import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//データ入力の準備
		Scanner sc = new Scanner(System.in);
		
		while(true){
			//データ入力
			int mid = sc.nextInt();
			int fin = sc.nextInt();
			int re = sc.nextInt();
			
			//終了条件の判定
			if(mid == -1 && fin == -1 && re == -1){
				break;
			}
			
			//試験を受けたかどうか分岐
			if (mid == -1 || fin == -1){
				System.out.println('F');
			}else{
				//成績の条件分岐
				int sum = mid + fin;
				
				if (sum >= 80){
					System.out.println('A');
				}else if (65 <= sum && sum < 80){
					System.out.println('B');
				}else if (50 <= sum && sum < 65){
					System.out.println('C');
				}else if (30 <= sum && sum < 50){
					if (re >= 50){
						System.out.println('C');
					}else{
						System.out.println('D');
					}
				}else{
					System.out.println('F');
				}
			}
		}
	}
}
