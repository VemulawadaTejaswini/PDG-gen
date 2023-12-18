

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int K = sc.nextInt();

		int[][] input = new int[h][w];
		for(int i = 0; i < h; i++){
			String tmp = sc.next();
			for(int j = 0; j < w; j++){
				input[i][j] = tmp.charAt(j) - '0';
			}
		}
		int[][] sumWhite = new int[h + 1][w + 1];

		for(int i = 1; i <= h; i++){
			for(int j = 1; j <= w; j++){
				sumWhite[i][j] = sumWhite[i - 1][j] + sumWhite[i][j - 1] - sumWhite[i - 1][j - 1];
				if(input[i - 1][j - 1] == 1){
					sumWhite[i][j]++;
				}
//				System.out.print(sumWhite[i][j]+" ");
			}
//			System.out.println();
		}

		int result = Integer.MAX_VALUE;
loop:		for(int i = 0; i < Math.pow(2, h - 1) ; i++){
			boolean[] horizon = new boolean[h - 1];

			int tmpI = i;
			int cut = 0;
			for(int j = 0; j < h - 1; j++){
				if(tmpI % 2 == 1){
					horizon[j] = true;
					cut++;
				}
				tmpI /= 2;
//				System.out.print(horizon[j]+ " ");
			}
//			System.out.println();

			int prevVert = 0;

			for(int j = 0; j < w; j++){
				int prevHor = 0;
				for(int k = 0; k < h; k++){
					if(k == h - 1 || horizon[k]){
//						System.out.println("check at "+k+","+j);
						int white = sumWhite[k + 1][j + 1] - sumWhite[prevHor][j + 1]
								- sumWhite[k + 1][prevVert] + sumWhite[prevHor][prevVert];
//						System.out.println("white "+white);
						prevHor = k + 1;
						if(white > K){
							if(prevVert == j){
//								System.out.println("abort");
								continue loop;
							}
							else {
//								System.out.println("cut vertical at "+j);
								prevVert = j;
								cut++;
								break;
							}
						}
					}
				}
			}
			result = Math.min(result, cut);
		}

		System.out.println(result);

	}

}
