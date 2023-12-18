import java.util.Scanner;
class Main{
	static String map[][];
	static boolean judge[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if((h|w) == 0)break;
			map = new String[h][w];
			judge = new boolean[h][w];
			for(int i = 0; i < h; i++){
				char[]temp = sc.next().toCharArray();
				for(int j = 0; j < w; j++){
					map[i][j] = String.valueOf(temp[j]);
				}
			}
			BoolFalse(0, 0);
		}
	}



	static void BoolFalse(int i,int j){
		if(judge[i][j] == true){
			System.out.println("LOOP");
		}else if(map[i][j].equals(".")){
			System.out.println(j + " " + i );
		}else{
			judge[i][j] = true;
			if(map[i][j].equals(">")){
				BoolFalse(i, j + 1);
			}else if(map[i][j].equals("<")){
				BoolFalse(i, j - 1);
			}else if(map[i][j].equals("^")){
				BoolFalse(i - 1, j);
			}else if(map[i][j].equals("v")){
				BoolFalse(i + 1, j);
			}
		}
	}
}