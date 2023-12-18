import java.util.Scanner;

public class Main{

	/**組み合わせの数を求める問題
	 *1~nまでの数のうち、3つの数をランダムで選び合計がxになる組み合わせは何通りになるかを求める
	 * @param args
	 * n:1~nまでの数　x:合計となる数
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){

		for(;scan.hasNext();){

			int n = scan.nextInt();
			int x = scan.nextInt();
			
//			int n = Integer.parseInt(args[in]);
//			int x = Integer.parseInt(args[in+1]);

			if(n == 0 && x == 0){
				break;
			}
			int count=0;

			for(int i = 1;i<= n;i++){
				for(int j = i+1;j <= n;j++){
					for(int k = j+1 ;k <= n;k++){
						if(i+j+k == x){				//異なる3種類の数字が入力値を満たしたらカウント
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}


}

