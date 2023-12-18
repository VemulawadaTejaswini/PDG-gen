import java.util.Scanner;

public class Main {

	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n--!=0){
			int Y = sc.nextInt();
			int M = sc.nextInt();
			int D = sc.nextInt();
			System.out.println(huga(Y, M, D));
		}
	}

	int huga(int y, int m, int d){
		int ret = 0;
		//System.out.println("here");
		while(y != 1000){
			//System.out.println(y + ": " + m + ": " + d);
			if(m == 11){
				++y;
				m = 1;
			}
			if(d == 20 && m % 2 == 0 && y % 3 != 0){
				d = 1;
				++m;
			}
			if(d == 21){
				d = 1;
				++m;
			}
			++ret;
			++d;
		}
		return ret-2;
	}

	int foge(int y, int m, int d){
		if(y == 1000){
			return 0;
		}
		if(m == 10 && d == 19){
			return foge(y+1, 1, 1) + 1;
		}
		if(m % 2 == 1 && d == 19){
			return foge(y, m+1, 1) + 1;
		}
		if(m % 2 == 0 && d == 20){
			return foge(y, m+1, 1) + 1;
		}
		return foge(y, m, d+1) + 1;
	}
	public static void main(String[] args){
		new Main().run();
	}

}