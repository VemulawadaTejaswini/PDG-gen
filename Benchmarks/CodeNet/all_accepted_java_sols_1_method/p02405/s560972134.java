import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//縦と横の長さ0になるまでの繰り返し	
		while(true){
			
	//入力の読み込み

			
			
			int H = sc.nextInt(); //縦の長さ
			int W = sc.nextInt(); //横の長さ
			
	//縦と横の長さ0ならばプログラム終了

			if(H==0&&W==0)break;
			
	//一行に何文字出力するか
	for ( int i = 0; i < H; i++ ){
		//何行出力するか
		    for ( int j = 0; j < W; j++ ){
		    	//偶数行の時で奇数番目の時と奇数行の時で偶数番目の時に出力
		        if( i%2==0&&j%2==1||i%2==1&&j%2==0){
		            System.out.print(".");
		        } else {
		            System.out.print("#");
		        }
		    }
		    //改行
		    System.out.println("");
		}
	 //空白行
	System.out.println("");

	
	}
	
	}
	
}
