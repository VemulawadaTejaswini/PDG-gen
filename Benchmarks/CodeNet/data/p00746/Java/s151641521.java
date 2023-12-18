import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0)break;
			calc(n);
		}
	}
	
	public void calc(int n){
		int x[] = new int[n];
		int y[] = new int[n];
		x[0] = 0; y[0] = 0;
		int ue = 0;
		int shita = 0;
		int hidari = 0;
		int migi = 0;
		
		for(int i = 1; i < n; i++){
			int ni = sc.nextInt();
			int di = sc.nextInt();
			if(di == 0){
				x[i] = x[ni] - 1;
				y[i] = y[ni];
				if(x[i] < hidari) hidari = x[i];
			}
			else if(di == 1){
				x[i] = x[ni];
				y[i] = y[ni] - 1;
				if(y[i] < shita) shita = y[i];
			}
			else if(di == 2){
				x[i] = x[ni] + 1;
				y[i] = y[ni];
				if(x[i] > migi) migi = x[i];
			}
			else if(di == 3){
				x[i] = x[ni];
				y[i] = y[ni] + 1;
				if(y[i] > ue) ue = y[i];
			}
		}
		
		System.out.print(migi - hidari + 1);
		System.out.print(" ");
		System.out.println(ue - shita + 1);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}