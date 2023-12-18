import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int direction[][] = new int[][] {{0,-1},{-1,0},{0,1},{1,0}};
		char[][] s = new char[h][w];
		for(int i=0; i<h; i++){
			String line = sc.next();
			s[i] = line.toCharArray();
		}
		boolean result = true;
		for (int i=0; i<h; i++){
			for (int j=0; j<w; j++){
				char masu = s[i][j];
				boolean tonariFlg=false;
				if (masu == '#'){
					tonariFlg = false;
					for (int k=0; k<direction.length; k++){
						int x = i + direction[k][0];
						int y = j + direction[k][1];
						if ((x >= 0 && y >= 0) && (x < h && y < w)){
							char tonari = s[x][y];
							if (tonari == '#'){
								tonariFlg = true;
								break;
							}
						}
					}
					if (!tonariFlg){
						result = false;
						break;
					}
				}
			}
			if (result == false){
				break;
			}
		}
		if (result){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
