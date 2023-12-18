package aoj0103;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		int p[] = new int[4];
		int i=0;
		double dx,dy;
		
		for(i = 0;i<4;i++){
			p[i]=sc.nextInt();
		}
		
		dx = Math.pow((double)(p[0]-p[2]), 2.0);
		dy = Math.pow((double)(p[1]-p[3]), 2.0);
		
		System.out.printf("%.8f\n", Math.sqrt((dx+dy)));
	}

}

