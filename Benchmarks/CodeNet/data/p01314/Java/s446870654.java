import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n != 0) calc(n);
			else break;
		}
	}
	public void calc(int n){
		int count = 0;
		for(int i = 1; i < n; i++){
			int sum = 0;
			for(int j = i; j < n; j++){
				sum = sum + j;
				if(sum == n) count++;
				else if(sum > n) break;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}