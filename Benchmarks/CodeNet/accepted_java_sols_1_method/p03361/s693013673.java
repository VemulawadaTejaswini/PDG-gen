import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	  int H = sc.nextInt();
	  int W = sc.nextInt();
	  String[][] w = new String[H][W];

	  for(int i=0; i<H; i++) {
		  w[i] = sc.next().split("");
	  }
	  sc.close();

	  boolean flg = true;
	  // 行ループ
	  for(int k=0; k<H; k++){
		  // 列ループ
		  for(int l=0; l<W; l++){
			  if (w[k][l].equals("#")) {

				  // 下
				  if (k < (H - 1)) {
					  if(w[k+1][l].equals("#")) {
						  continue;
					  }
				  }
				  // 上
				  if (k > 0) {
					  if(w[k-1][l].equals("#")) {
						  continue;
					  }
				  }
				  // 右
				  if (l < (W - 1)) {
					  if(w[k][l+1].equals("#")) {
						  continue;
					  }
				  }
				  // 左
				  if (l > 0) {
					  if(w[k][l-1].equals("#")) {
						  continue;
					  }
				  }
				  
				  // continueされなかったらNG
				  System.out.println("No");
				  flg = false;
				  break;
			  }
		  }
		  if (!flg) {
			  break;
		  }
	  }
	  if (flg) {
		  System.out.println("Yes");
	  }
	}
}