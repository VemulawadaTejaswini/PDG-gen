import java.util.*;
import java.lang.*;
public class Main {
	public static int[][] Forec(int h, int w, char[][] wea){
		int cnt = -1;
		int forec[][] = new int[h][w];
		boolean flag;
		for(int i = 0; i < h; i++){
			flag = false;
			cnt = -1;
			for(int k = 0; k < w; k++){
				if(wea[i][k] == 'c'){
					cnt = 0;
					flag = true;
				}
				else if(flag == true && wea[i][k] == '.') cnt++;
				else if(wea[i][k] == '.') cnt = -1;
				forec [i][k] = cnt;
			}
		}
		return forec;
	}
	void dolt(){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] str = new char[h][w];
		int [][] forec = new int[h][w];
		for(int i = 0; i < h; i++){
			str[i] = sc.next().toCharArray();
		}
		forec = Forec(h, w, str);
		for(int i = 0; i < h; i++){
			for(int k = 0; k < w; k++){
				System.out.print(forec[i][k]);
				if(k + 1 != w) System.out.print(" "); 
			}
			System.out.println("");
		}
	}
	public static void main(String[] args){
		new Main(). dolt();
	}
}