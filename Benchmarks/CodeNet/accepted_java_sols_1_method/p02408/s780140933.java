import java.util.Scanner;

public class Main {


	/**入力したトランプの数と種類から、持っていないトランプの種類を出力する
	 *
	 * @param args	　枚数、マーク、番号
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){

		int[] spade= new int[13];
		int[] heart = new int[13];
		int[] club = new int[13];
		int[] diamond = new int[13];

		//初期化	0:not found 1:found
		for(int i=0;i<13;i++){
			spade[i] =0;
			heart[i] =0;
			club[i] = 0;
			diamond[i] = 0;
		}

		int rest = scan.nextInt();
		for(int k=1; k < rest * 2;k=k+2){

			String mark = scan.next();//args[k];

			int number = scan.nextInt();//r.parseInt(args[k+1]);

			if(mark.equals("S")){			//spadeの場合
				spade[number-1] =1;
			}
			if(mark.equals("H")){			//heartの場合
				heart[number-1] =1;
			}
			if(mark.equals("C")){			//clubの場合
				club[number-1] = 1;
			}
			if(mark.equals("D")){			//diamondの場合
				diamond[number-1] = 1;
			}

		}

		//output
		for(int j=1;j<=13; j++){
			if(spade[j-1] == 0)
				System.out.println("S "+j);
		}
		for(int j=1;j<=13; j++){
			if(heart[j-1] == 0)
				System.out.println("H "+j);
		}
		for(int j=1;j<=13; j++){
			if(club[j-1] == 0)
				System.out.println("C "+j);
		}
		for(int j=1;j<=13; j++){
			if(diamond[j-1] == 0)
				System.out.println("D "+j);
		}
	}
}

