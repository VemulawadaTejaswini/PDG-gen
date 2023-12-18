import java.util.Scanner;

public class Main {


	/**
	 * たてHｃｍよこWｃｍのチェック柄の長方形を描くプログラム
	 * @param args　H,W
	 */

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){


		for(;scan.hasNext();){
			
			int height = scan.nextInt();
			int width = scan.nextInt();
			
			if(height == 0 && width== 0){
				break;
			}
//			int height=Integer.parseInt(args[k]);
//			int width=Integer.parseInt(args[k+1]);

			boolean flag=true;



			for(int i=0;i< height;i++){
				for(int j = 0;j< width;j++){
					if(flag){
						System.out.print("#");
						flag = false;
					}else{
						System.out.print(".");
						flag = true;
					}
				}
				System.out.println("");
				flag =!flag;
				if(width%2 != 0){//偶数だったら
					flag = !flag;	//フラグ反転処理
				}

			}
			System.out.println("");		//一つのくくりが終わったので改行する
			flag = true;				//最初は#
		}
	}
}
