import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			else calc(n);
		}
	}
	public void calc(int n){
		int sum = 0;
		for(int i = n + 1; i < 2 * n + 1; i++){
			if(i != 1){
				int t = 1;
				for(int j = 2; j < i; j++){
					if(i % j == 0) {
						t = 0;
						break;
					}
				}
				if(t == 1) sum++;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}