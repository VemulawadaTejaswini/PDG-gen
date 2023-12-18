
import java.util.Scanner;

public class Main {
	public static void PrintChess(int H,int W){
		for(int i=1;i<H+1;i++){
			PrintLine(i, W);
		}
	}
	//一行出力メソッド
	public static void PrintLine(int lineCounter,int W){
		//引数はラインカウンタと高さ
		if(lineCounter%2==0){
			for(int i=1;i<W+1;i++){
				if(i%2==0){
					System.out.print("#");
				}else{
					System.out.print(".");
				}
			}
		}else{
			for(int i=1;i<W+1;i++){
				if(i%2==0){
					System.out.print(".");
				}else{
					System.out.print("#");
				}
			}
			
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int H;
		int W;
		//最初の値を格納
		H=scanner.nextInt();
		W=scanner.nextInt();
		while(H!=0&&W!=0){
			PrintChess(H, W);
			
			System.out.println("");
			H=scanner.nextInt();
			W=scanner.nextInt();
		}
		scanner.close();
		//System.out.println("exit");
	}

}