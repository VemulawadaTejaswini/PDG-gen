import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int w = sc.nextInt();
			int d = sc.nextInt();
			if(w == 0 && d == 0)break;
			else calc(w, d);
			
		}
	}
	public void calc(int w, int d){
		int[] frontH = new int[w];
		int[] sideH = new int[d];
		
		for(int i = 0; i < w; i++){
			int f = sc.nextInt();
			frontH[i] = f;
		}
		for(int i = 0; i < d; i++){
			int s = sc.nextInt();
			sideH[i] = s;
		}
		
		//calc
		for(int i = 0; i < d; i++){
			for(int j = 0; j < w; j++){
				if(sideH[i] == frontH[j]) {
					frontH[j] = 0;
					break;
				}
			}
		}
		
		int sum = 0;
		for(int i = 0; i < w; i++){
			sum = sum + frontH[i];
		}
		for(int i = 0; i < d; i++){
			sum = sum + sideH[i];
		}
		System.out.println(sum);
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}