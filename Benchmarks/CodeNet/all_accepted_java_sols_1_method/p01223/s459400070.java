import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int an = sn.nextInt();
		for(int i = 0; i < an; i++){
			int bn = sn.nextInt();
			int blocks[] = new int[bn];
			for(int j = 0; j < bn; j++) blocks[j] = sn.nextInt();
			int up = 0, down = 0;
			for(int j = 0; j < blocks.length-1; j++){
				int diff = blocks[j] - blocks[j+1];
				up = Math.min(up, diff);
				down = Math.max(down, diff);
			}
			System.out.println(-up+" "+down);
		}
	}
}