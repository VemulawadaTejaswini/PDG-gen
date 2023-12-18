import java.util.Scanner;

public class Main {


	/**与えられた行列に対し、それぞれの行と列の和をもとめる。
	 *表の行数と列数の行列を読み込んで、
	 *各行と列の合計を挿入した新しい表を出力するプログラムを作成する。
	 * @param args	行数、列数、行列
	 */
	
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int gyo = scan.nextInt();
		int retu = scan.nextInt();
		
//		int gyo = Integer.parseInt(args[0]);		//4
//		int retu = Integer.parseInt(args[1]);		//5

		int[] gyo_sum = new int[gyo];								//行（横）の合計値
		int[] retu_sum = new int[retu];							//列（縦）の合計値
		int fin_sum=0;

		for(int k = 0;k < gyo; k++){				//行単位
		
			for(int i=0;i < retu; i++){			//列単位
				int now_cell = scan.nextInt();
				gyo_sum[k] = gyo_sum[k] + now_cell;
				System.out.print(now_cell+" ");
				retu_sum[i] = retu_sum[i] + now_cell;
//				gyo_sum[k] = gyo_sum[k] + Integer.parseInt(args[2+5*k+i]);
//				System.out.print(args[2+5*k+i]+" ");
//				retu_sum[i] = retu_sum[i] + Integer.parseInt(args[2+5*k+i]);
			}
			
		
			System.out.println(gyo_sum[k]);
			fin_sum = fin_sum + gyo_sum[k];
		}
		for(int j = 0;j < retu;j++){
			System.out.print(retu_sum[j] + " ");	//列の和出力
			//fin_sum = fin_sum + retu_sum[j];
		}
		System.out.println(fin_sum);	//最終合計

	}

}

