import java.util.Scanner;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n;
		int r = 0;
		while(scan.hasNext()){
			n = scan.nextInt();
			if(n == 0){
				break;
			}
			int x[] = new int[n];
			int y[] = new int[n];
			int h[] = new int[n];
			int w[] = new int[n];
			int size[] = new int[n];
			for(int i = 0; i < n ; i++){
				x[i] = scan.nextInt();
				y[i] = scan.nextInt();
				h[i] = scan.nextInt();
				w[i] = scan.nextInt();
				size[i] = x[i] + y[i] + h[i];
				if(size[i] <= 60){
					if(w[i] <= 2){
						r = r + 600;
					}else if(w[i] <= 5){
						r = r + 800;
					}else if(w[i] <= 10){
						r = r + 1000;
					}else if(w[i] <= 15){
						r = r + 1200;
					}else if(w[i] <= 20){
						r = r + 1400;
					}else if(w[i] <= 25){
						r = r + 1600;
					}
				}else if(size[i] <= 80){
					if(w[i] <= 5){
						r = r + 800;
					}else if(w[i] <= 10){
						r = r + 1000;
					}else if(w[i] <= 15){
						r = r + 1200;
					}else if(w[i] <= 20){
						r = r + 1400;
					}else if(w[i] <= 25){
						r = r + 1600;
					}
				}else if(size[i] <= 100){
					if(w[i] <= 10){
						r = r + 1000;
					}else if(w[i] <= 15){
						r = r + 1200;
					}else if(w[i] <= 20){
						r = r + 1400;
					}else if(w[i] <= 25){
						r = r + 1600;
					}
				}else if(size[i] <= 120){
					if(w[i] <= 15){
						r = r + 1200;
					}else if(w[i] <= 20){
						r = r + 1400;
					}else if(w[i] <= 25){
						r = r + 1600;
					}
				}else if(size[i] <= 140){
					if(w[i] <= 20){
						r = r + 1400;
					}else if(w[i] <= 25){
						r = r + 1600;
					}
				}else if(size[i] <= 160){
					if(w[i] <= 25){
						r = r + 1600;
					}
				}
			}
			System.out.println(r);
			r = 0;
		}
	}
}