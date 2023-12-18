import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		call(scan.nextInt());
	}

	/**
	 * 3の倍数と下一桁が３のときだけ出力する(世界のナベアツ式）
	 * @param n　入力する数
	 */
	public static void call(int n){

		for(int i = 1;i<=n;i++){
			//int i = 1;

			int x = i;

			if(x % 3 == 0){
				System.out.print(" "+i);
			}else{
				while(x >= 3){
					if(x % 10 == 3){
						System.out.print(" "+i);
						break;
					}
					x = x / 10;
				}
			}

		}
		System.out.println();
	}
}

