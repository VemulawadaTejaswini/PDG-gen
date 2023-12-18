import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] HW = br.readLine().split(" ") ; 
		int H = Integer.parseInt(HW[0]);
		int W = Integer.parseInt(HW[1]);
		
		String[][] masu = new String[H+2][W+2];
		for(int i=0;i<H+2;i++) {
			Arrays.fill(masu[i], "a");
		}
		for(int Hin=0; Hin<H; Hin++) {
			String[] IN =br.readLine().split("") ; 
			for(int Win=0; Win<W; Win++) {
				masu[Hin+1][Win+1] = IN[Win];
			}
		}
		
		String[][] ans = new String[H+2][W+2];
		for(int h=0; h<H; h++) {
			for(int w=0; w<W; w++) {
				if(!masu[h+1][w+1].equals("#")) {
					int count = 0;
					if(masu[h][w].equals("#")) {count++;}//左上
					if(masu[h][w+1].equals("#")) {count++;}//上
					if(masu[h][w+2].equals("#")) {count++;}//右上
					if(masu[h+1][w].equals("#")) {count++;}//左
					if(masu[h+1][w+2].equals("#")) {count++;}//右
					if(masu[h+2][w].equals("#")) {count++;}//左下
					if(masu[h+2][w+1].equals("#")) {count++;}//下
					if(masu[h+2][w+2].equals("#")) {count++;}//右下
					ans[h+1][w+1] = Integer.toString(count);
				}else {
					ans[h+1][w+1] = "#";
				}
			}
		}
		
		for(int Hout=0; Hout<H;Hout++) {
			for(int Wout=0; Wout<W; Wout++) {
				System.out.print(ans[Hout+1][Wout+1]);	
			}
			System.out.println();	
		}
		
	}
}