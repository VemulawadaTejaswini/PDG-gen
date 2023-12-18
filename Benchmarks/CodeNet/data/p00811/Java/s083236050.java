import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	int[] sosuu = new int[100001];
	public void run() {
		sosuuCalc();
		while(sc.hasNext()){
			int m = sc.nextInt();
			double a = sc.nextInt();
			double b = sc.nextInt();
			double c = a/b;
			if(m == 0 && a  == 0 && b == 0)break;
			else calc(m,c);
			
		}
	}
	public void sosuuCalc(){
		sosuu[0] = -1;
		sosuu[1] = -1;
		for(int i = 2; i < 100001; i++){
			if(sosuu[i] == 0){
				sosuu[i] = 1;
				for(int j = i * 2; j < 100001; j = j + i){
					sosuu[j] = -1;
				}
			}
		}
	}
	public void calc(int m, double c){
		int t = 0;
		for(int pq = m; pq > 3; pq--){
			for(int p = 2; p < pq; p++){
				if(sosuu[p] == 1 && pq % p == 0){
					int q = pq / p;
					if(p > q) break;
					if(sosuu[q] == 1 && c <= ((double) p) / ((double)q)){
						System.out.println(p + "　" + q);
						t++;
						break;
					}
				}
			}
			if(t != 0) break;
		}
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}