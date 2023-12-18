
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] weater = new char[H][W];
		int[][] area = new int[H][W];
		int i, j, time;
		for(i=0; i<H; i++)weater[i] = sc.next().toCharArray();
		for(i=0; i<H; i++){
			time = -1;
			for(j=0; j<W; j++){
				if(weater[i][j] == 'c'){
					time = 0;
					area[i][j] = time;
					time++;
				}
				else if(time >= 0){
					area[i][j] = time;
					time++;
				}
				else if(time < 0)area[i][j] = time;
			}
		}
		for(i=0; i<H; i++){
			for(j=0; j<W; j++){
				if(j == W-1)System.out.println(area[i][j]);
				else System.out.println(area[i][j]+" ");
			}
		}
	}

}