package e_Bomber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		int x[][] = new int[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0 ; j < w; j++){
				x[i][j]=0;
			}
		}
		int wsum[] = new int[h];
		int hsum[] = new int[w];

		for(int i = 0; i < m; i++){
			int hm = Integer.parseInt(sc.next())-1;
			int wm = Integer.parseInt(sc.next())-1;
			x[hm][wm] = 1;
			wsum[hm]+=1;
			hsum[wm]+=1;
		}
		sc.close();
		//横のsumを作成
//		int wsum[] = new int[h];
//		for(int i = 0 ; i < h ; i++){
//			int n = 0;
//			for(int k = 0 ; k < w ; k++){
//				n += x[i][k];
//			}
//			wsum[i] = n;
//		}
//		//縦のsumを作成
//		int hsum[] = new int[w];
//		for(int i = 0 ; i < w ; i++){
//			int n = 0;
//			for(int k = 0 ; k < h ; k++){
//				n += x[k][i];
//			}
//			hsum[i] = n;
//		}
//
//		for(int a : wsum){
//			System.out.print(a + ",");
//		}
//		System.out.println();
//		for(int a : hsum){
//			System.out.print(a + ",");
//		}
//		System.out.println();


//		for(int li[] : x){
//			for(int a : li){
//				System.out.print(a);
//			}
//			System.out.println();
//		}

		int max = 0;
		for(int i = 0 ; i < h ; i++){
			for(int j = 0 ; j < w; j++){
				int n = hsum[j] + wsum[i] - x[i][j];
				if(max < n){
					max = n;
				}
			}
		}
		System.out.println(max);
	}
}
