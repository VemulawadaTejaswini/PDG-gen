import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int[] card = new int[9];
			int[][] color = new int[3][9];
			int[] rgb = new int[3];
			int set = 0;
			for(int j = 0; j < 9; j++){
				card[j] = sc.nextInt();
			}
			for(int j = 0; j < 9; j++){
				String s = sc.next();
				switch(s.charAt(0)){
					case 'R':
						color[0][rgb[0]] = card[j];
						rgb[0]++;
						break;
					case 'G':
						color[1][rgb[1]] = card[j];
						rgb[1]++;
						break;
					case 'B':
						color[2][rgb[2]] = card[j];
						rgb[2]++;
						break;
				}
			}
			for(int j = 0; j < 3; j++){
				Arrays.sort(color[j]);
				for(int k = 2; k < rgb[j]; k++){
					if((color[j][k] - color[j][k-1] == 0 && color[j][k-1] - color[j][k-2] == 0) || (color[j][k] - color[j][k-1] == 1 && color[j][k-1] - color[j][k-2] == 1)){
						set++;
						k += 2;
					}
				}
			}
			if(set == 3) System.out.println("1");
			else System.out.println("0");
		}
	}
}