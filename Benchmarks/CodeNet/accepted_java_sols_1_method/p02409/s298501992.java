import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int floor = 12;
		int room = 10;
		int list[][] = new int[floor][room];
		//0で初期化
		for(int i = 0;i < floor;i++){
			for(int j = 0;j < room;j++){
				list[i][j] = 0;
			}
		}
		int b = 0;
		int f = 0;
		int r = 0;
		int v = 0;
		for(int k = 0;k < n;k++){
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();
			switch(b){
			case 1:
				list[f-1][r-1] += v;
				break;
			case 2:
				list[f+2][r-1] += v;
				break;
			case 3:
				list[f+5][r-1] += v;
				break;
			case 4:
				list[f+8][r-1] += v;
				break;
			}
		}
		for(int i = 0;i < floor;i++){
			for(int j = 0;j < room;j++){
				System.out.print(" " + list[i][j]);
			}
			System.out.println();
			if(i % 3 == 2 && i != (floor - 1)){
				System.out.println("####################");
			}
		}
	}
}
