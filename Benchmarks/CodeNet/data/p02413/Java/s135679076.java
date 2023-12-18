import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int h,w,wsum = 0,E=0,O=0;
		int [][] box;
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		box = new int [h+1][w+1];

		for(int i =0; i<h; i++) {
			for(int j = 0; j < w; j++) {
				box[i][w]+= box[i][j] = sc.nextInt();
				box[h][j]+= box[i][j];
				System.out.print(box[i][j] + " ");
			}
			System.out.print(box[i][w]);
			box[h][w]+=box[i][w];
			System.out.println("");
		}
		for(int i=0; i<box[h].length;i++) {
			System.out.print(box[h][i]);
			if(i < box[h].length-1) {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
}

