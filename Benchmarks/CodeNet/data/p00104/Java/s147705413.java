import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		Main myclass = new Main();
		int H = scan.nextInt();
		int W = scan.nextInt();
		while(H != 0 && W != 0){
			String mozi[] = new String[H];
			char HW[][] = new char[H][W];
			for(int i = 0 ; i < H ; i++){
				mozi[i] = scan.next();
			}
			for(int i = 0 ; i < H ; i++){
				for(int j = 0 ; j < W ; j++){
					HW[i][j] = mozi[i].charAt(j);
				}
			}
			myclass.tadoru(HW , 0 , 0 , H ,W);
			H = scan.nextInt();
			W = scan.nextInt();
		}
	}
	void tadoru(char[][] HW , int x , int y , int H , int W){
		if(HW[y][x] == '>'){
			HW[y][x] = '0';
			if(x+1 < W){
				tadoru(HW , x+1 , y , H , W);
			}else{
				System.out.println("LOOP");
			}
		}else if(HW[y][x] == 'v'){
			if(y+1 < H){
				HW[y][x] = '0';
				tadoru(HW , x , y+1 , H , W);
			}else{
				System.out.println("LOOP");
			}
		}else if(HW[y][x] == '<'){
			HW[y][x] = '0';
			if(x-1 >= 0){
				tadoru(HW , x-1 , y , H , W);
			}else{
				System.out.println("LOOP");
			}
		}else if(HW[y][x] == '^'){
			HW[y][x] = '0';
			if(y-1 >= 0){
				tadoru(HW , x , y-1 , H , W);
			}else{
				System.out.println("LOOP");
			}
		}else if(HW[y][x] == '.'){
			System.out.println(x+" "+y);
		}else{
			System.out.println("LOOP");
		}
	}
}