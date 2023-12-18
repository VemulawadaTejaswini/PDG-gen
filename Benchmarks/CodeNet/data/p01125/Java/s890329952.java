import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int pre_x, pre_y;//¼OÌxÀWÆyÀW
	static int[][] field = new int[21][21];
	public static void main(String[] args){
		while(read()){
			solve();
		}
	}
	static boolean read(){
		/*
		 * ±±©ç
		 */
		for(int i = 1; i < 21; i++)
			for(int j = 1; j < 21; j++)
				field[i][j] = 0;
		
		pre_x = 10; pre_y = 10;
		/*
		 * ±±ÜÅªú»
		 */
		
		int n = sc.nextInt();
		if(n == 0)
			return false;
		//tB[hÉ«Þ
		for(int i = 0; i < n; i++){
			int j, k;
			j = sc.nextInt(); k = sc.nextInt();
			field[k][j] = 1;
		}
		char EWSN;//¼ìkð\·¶
		int distance;//Ú®£
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int x = 0, y = 0;
			EWSN = sc.next().charAt(0);
			distance = sc.nextInt();
			if(EWSN == 'E'){
				x = pre_x + distance;//Ú®µ½ ÆÌxÀW@@¼OÌxÀW + Ú®£
				for(int j = pre_x; j <= x; j++)
					field[pre_y][j] = 0;//P}XÚ®·é²ÆÉñûµ½±ÆÉµÄ¨­
				pre_x = x;//ÀWÌXV
			}else if(EWSN == 'W'){
				x = pre_x - distance;
				for(int j = pre_x; j >= x; j--)
					field[pre_y][j] = 0;
				pre_x = x;
			}else if(EWSN =='N'){
				y = pre_y + distance;
				for(int j = pre_y; j <= y; j++)
					field[j][pre_x] = 0;
				pre_y = y;
			}else if(EWSN == 'S'){
				y = pre_y - distance;
				for(int j = pre_y; j >= y; j--)
					field[j][pre_x] = 0;
				pre_y = y;
			}
				
		}
		return true;
	}
	static void solve(){
		int flag = 0;
		for(int i = 1; i < 21; i++)
			for(int j = 1; j < 21; j++)
				if(field[i][j] == 1)
					flag++;
		if(flag != 0){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}