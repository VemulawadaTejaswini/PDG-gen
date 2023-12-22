import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();

		int max_x = w;
		int min_x = 0;
		int max_y = h;
		int min_y = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();

			switch(a){
			case 1:
				if(x > min_x){
					min_x = x;
				}
				continue;
			case 2:
				if(x < max_x){
					max_x = x;
				}
				continue;
			case 3:
				if(y > min_y){
					min_y = y;
				}
				continue;
			case 4:
				if(y < max_y){
					max_y = y;
				}
				continue;
			}
		}
		w = max_x-min_x;
		h = max_y-min_y;
		if (w < 0) {
			w = 0;
		}
		if (h < 0) {
			h = 0;
		}
		int white = w * h;
		if(white < 0){
			white = 0;
		}
		System.out.println(white);
		sc.close();
	}
}
