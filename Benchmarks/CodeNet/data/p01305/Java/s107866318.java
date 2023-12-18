import java.util.Scanner;

public class Main {
	
	public static int[] G = new int[9];
	public static int[] J = new int[9];
	public static int[] G2 = new int[9];
	public static boolean[] used = new boolean[9];
	public static int win = 0;
	public static int lose = 0;
	public static int draw = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();

	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i++){

			for(int j = 0; j < 9; j++){
				G[j] = sc.nextInt();
			}
			for(int j = 0; j < 9; j++){
				J[j] = sc.nextInt();
			}
			win = 0;
			lose = 0;
			draw = 0;
			setOrder(0);
			//System.out.println("win = " + win + ", lose = " + lose + ", draw = " + draw);
			double g = (double)win / (double)(win + lose + draw);
			double j = (double)lose / (double)(win + lose + draw);
			//System.out.println(g + " " +  j);
			System.out.printf("%.5f %.5f\n", g, j);
			
		}
	}
	
	public static void battle(){
		int g = 0,j = 0;
		for(int i = 0; i < 9; i++){
			if(G2[i] < J[i]){
				j += G2[i] + J[i];
			}
			else{
				g += G2[i] + J[i];
			}
		}
		if(j > g){
			lose++;
		}
		else if(g > j){
			win++;
		}
		else{
			draw++;
		}
	}
	
	public static void setOrder(int depth){
		if(depth == 9){
			battle();
		}
		for(int i = 0; i < 9; i++){
			if(used[i] == false){
				used[i] = true;
				G2[depth] = G[i];
				setOrder(depth + 1);
				used[i] = false;
			}
		}
	}

}