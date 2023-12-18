import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w, h;
		int[][] x;

		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0)
				break;
			else{
				x = new int[h][w];
				for(int i = 0; i < h; i++){
					for(int j = 0; j < w; j++){
						x[i][j] = sc.nextInt();
					}
				}
				int answer = 0;
				for(int i = 0; i < h; i++){
					for(int j = 0; j < w; j++){
						if(x[i][j] != 1)
							break;
						else{
							search(x, i, j, w, h);
							answer++;
						}
					}
				}
				System.out.println(answer);
			}
		}
	}

	static void search(int[][] x, int i, int j, int w, int h){
		x[i][j] = 3;
		for(int k = i - 1; k <= i + 1; k++){
			for(int l = j - 1; j <= j + 1; j++){
				if((k == i && l == j) || k < 0 || k >= h || l < 0 || l >= w)
					break;
				else{
					if(x[k][l] == 1){
						x[k][l] = 3;
						search(x, k, l, w, h);
					}
					else if(x[k][l] == 0){
						x[k][l] = 2;
					}
				}
			}
		}
	}
}