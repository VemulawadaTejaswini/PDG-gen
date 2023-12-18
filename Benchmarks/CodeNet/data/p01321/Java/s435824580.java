import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int[][] data;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		while(read()){
			slove();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)
			return false;
		
		data = new int[n][5];
		String[] line;
		for(int i = 0; i < n; i++){
			data[i][0] = sc.nextInt();
			data[i][1] = sc.nextInt();
			data[i][2] = sc.nextInt();
			data[i][3] = sc.nextInt();
			data[i][4] = sc.nextInt();
		}
		return true;
	}
	static void slove(){
		int max = 0, min = 0;
		for(int k = 0; k < 5; k++){
			max += data[0][k];
			min += data[0][k];
		}
		for(int i = 0; i < n; i++){
			int temp = 0;
			for(int j = 0; j < 5; j++){
				temp += data[i][j];
			}
			max = Math.max(max, temp);
			min = Math.min(min, temp);
			
		}
		System.out.print(max + " ");
		System.out.println(min);
	}
}