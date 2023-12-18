import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	int[] sosuu = new int[1300000];
	public void run() {
		calcSosuu(1300000);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			calc(n);
		}
	}
	public void calc(int n){
		int sum = 0;
		if(sosuu[n] == -1) System.out.println(0);
		else{
			for(int i = n; i < 1300000; i++){
				if(sosuu[i] == 1) sum++;
				else if(sosuu[i] == -1) break;
			}
			for(int i = n - 1; i >= 0; i--){
				if(sosuu[i] == 1) sum++;
				else if(sosuu[i] == -1) break;
			}
			System.out.println(sum + 1);
		}
	}

	public void calcSosuu(int t){
		sosuu[0] = 1;
		sosuu[1] = 1;
		for(int i = 0; i < t; i++){
			if(sosuu[i] == 0){
				sosuu[i] = -1;
				for(int j = i * 2; j < t; j = j + i){
					sosuu[j] = 1;
				}
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}