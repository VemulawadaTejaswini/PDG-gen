import java.util.Scanner;
public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int i = 1;
		int n = s.nextInt();
		int x;
		int a = 0;
		x = i;
		while(a>=0){
			switch(a){
				case 0:
					a = -1;
					x = i;
					if(x % 3 == 0){
						System.out.print(" " + i);
						break;
					}
				case 1:
					if(a == 1){
						a = -1;
					}
					if(x % 10 == 3){
						System.out.print(" " + i);
						break;
					}
					x /= 10;
					if(x!=0){
						a = 1;
					}
			}
			if(a!=1){
			i++;
			if(i <= n){
				a = 0;
			}
			}
		}
		System.out.print("\n");
	}
	public static void main(String args[]){
		Main m = new Main();
		m.run();
	}
}
/*
3 6 9 12 13 15 18 21 23 24 27 30 33 36 39 42 43 45 48 51 53 54 57 60
3 6 9 12 13 15 18 21 23 24 27 30 31 32 33 34 35 36 37 38 39 42 43 45 48 51 53 54 57 60
*/