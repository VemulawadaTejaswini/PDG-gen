import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h,w,cl;
		h = sc.nextInt();
		w = sc.nextInt();
		char[][] map = new char[h][];
		int[][] map2 = new int[h][w];
		for(int i = 0;i < h;i++){
			map[i] = sc.next().toCharArray();
			cl = -1;
			for(int k = 0;k < map[i].length;k++){
				if(map[i][k] == 'c'){
					//System.out.print(0);
					map2[i][k] = 0;
					cl = k;
				}else if(cl != -1){
					//System.out.print(k-cl);
					map2[i][k] = k-cl;
				}else{
					//System.out.print(cl);
					map2[i][k] = cl;
				}
				//if(k != w-1)System.out.print(" ");
			}
			//System.out.println("");
		}
		for(int i = 0; i < h;i++){
			for(int k = 0; k < w;k++){
				System.out.print(map2[i][k]);
				if(k != w-1)System.out.print(" ");
			}
			System.out.println("");
		}
	}
}