import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while( true ){
			int w = Integer.parseInt(scan.next());
			int h = Integer.parseInt(scan.next());
			if( w == 0 && h == 0 ){
				break;
			}
			MAP[][] state = new MAP[w][h];
			for( int j = 0; j < h; j++ ){
				for( int i = 0; i < w; i++ ){
					state[i][j] = new MAP();
					state[i][j].Reset();
				}
			}
			//??????????????\??????
			int temp = 0;
			for( int j = 0; j < h-1; j++ ){
				for( int i = 0; i < w-1; i++ ){
					//??????????£?
					temp = Integer.parseInt(scan.next());
					state[i][j].r = temp;
					state[i+1][j].l = temp;
				}
				for( int i = 0; i < w; i++ ){
					//??????????£?
					temp = Integer.parseInt(scan.next());
					state[i][j].d = temp;
					state[i][j+1].u = temp;
				}
			}
			//????????????????????????????£?
			for( int i = 0; i < w-1; i++){
				temp = Integer.parseInt(scan.next());
				state[i][h-1].r = temp;
				state[i+1][h-1].l = temp;
			}
			
			System.out.println(Move(state, w, h));
			
		}
		
		return;
	}
	
	public static int Move(MAP state[][], int w, int h){
		int[] x = new int[w*h];
		int[] y = new int[w*h];
		int sum = 0;
		int num = 0;
		int nextNum = 0;
		
		num = 1;
		x[0] = 0;
		y[0] = 0;
		state[0][0].step = 0;
		for( int i = 0; ; i++ ){
			for( int j = sum; j < sum + num; j++ ){
				if( x[j] == w - 1 && y[j] == h - 1 ){
					return i+1;
				}
				if( state[x[j]][y[j]].r == 0 ){
					if( state[x[j]+1][y[j]].step == -1){
						x[sum+num+nextNum] = x[j]+1;
						y[sum+num+nextNum] = y[j];
						state[x[j]+1][y[j]].step = i+1;
//						System.out.printf("%d %d\n", x[sum+num+nextNum], y[sum+num+nextNum]);
						nextNum++;
					}
				}
				if( state[x[j]][y[j]].d == 0 ){
					if( state[x[j]][y[j]+1].step == -1){
						x[sum+num+nextNum] = x[j];
						y[sum+num+nextNum] = y[j]+1;
						state[x[j]][y[j]+1].step = i+1;
//						System.out.printf("%d %d\n", x[sum+num+nextNum], y[sum+num+nextNum]);
						nextNum++;
					}
				}
				if( state[x[j]][y[j]].l == 0 ){
					if( state[x[j]-1][y[j]].step == -1){
						x[sum+num+nextNum] = x[j]-1;
						y[sum+num+nextNum] = y[j];
						state[x[j]-1][y[j]].step = i+1;
//						System.out.printf("%d %d\n", x[sum+num+nextNum], y[sum+num+nextNum]);
						nextNum++;
					}
				}
				if( state[x[j]][y[j]].u == 0 ){
					if( state[x[j]][y[j]-1].step == -1){
						x[sum+num+nextNum] = x[j];
						y[sum+num+nextNum] = y[j]-1;
						state[x[j]][y[j]-1].step = i+1;
//						System.out.printf("%d %d\n", x[sum+num+nextNum], y[sum+num+nextNum]);
						nextNum++;
					}
				}
				
			}
			sum += num;
			num = nextNum;
			if( nextNum == 0 ){
				break;
			}
			nextNum = 0;
		}
		return 0;
	}
	
}

class MAP{
	//1???????£????????????????????£????2???
	int u;
	int l;
	int r;
	int d;
	int step;	//?????????????????????????°??§?????????°???
	public void Reset(){
		u = 1;
		l = 1;
		r = 1;
		d = 1;
		step = -1;
		return;
	}
}