import java.util.*;
public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int H;	//縦
		 int W;	//横
		 while(true){
			 H = Integer.parseInt(scan.next());
			 W = Integer.parseInt(scan.next());
			 if(H == 0 && W == 0){
				 //HとWが0の時、終了。
				 break;
			 }//if
			 //--- 出力 ---
			 for (int i = 0; i < H; i++ ){
				 for (int j = 0; j < W; j++ ){
					 if(i == 0 || j == 0 || j == W-1 || i == H-1){
						 //iとjが0かつ、入力された横(W)と縦(H)の数字の時に "#" を出力する
						 System.out.print("#");
					 }else{
						 System.out.print(".");
					 }//if
				 }//for
				 System.out.println();
			 }//for
			 System.out.println();
		 }//while 
	}
}