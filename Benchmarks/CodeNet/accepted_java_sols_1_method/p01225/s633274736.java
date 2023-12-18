import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int[] card = new int[9];
			int[][] color = new int[3][9];
			int[] rgb = new int[3]; // ???????????°
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
				for (int k = 0; k < rgb[j]; k++) {
					for (int l = k+1; l < rgb[j]; l++) {
						if(color[j][k] > color[j][l]){
							int tmp = color[j][k];
							color[j][k] = color[j][l];
							color[j][l] = tmp;
						}
					}
				}
				for(int k = 0; k < rgb[j]; k++){
					for(int l = k+1; l < rgb[j]; l++){
						for(int m = l+1; m < rgb[j]; m++){
							if(color[j][k] != 0 && color[j][l] != 0 && color[j][m] != 0){
								int[] tmp = new int[3];
								tmp[0] = color[j][k];
								tmp[1] = color[j][l];
								tmp[2] = color[j][m];
								Arrays.sort(tmp);
								if((tmp[0] == tmp[1] && tmp[1] == tmp[2]) || (tmp[0]+1 == tmp[1] && tmp[1]+1 == tmp[2])){
									color[j][k] = 0;
									color[j][l] = 0;
									color[j][m] = 0;
									set++;
								}
							}
						}
					}
				}
			}
			if(set == 3) System.out.println("1");
			else System.out.println("0");
		}
	}
}