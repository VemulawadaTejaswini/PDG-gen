import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		keisan();
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0)break;
			else calc(n);
			
		}
	}
	int max = (int)Math.pow(2, 15);
	int m = (int)Math.sqrt(max);
	int[] memo = new int[max + 1]; 
	public void keisan(){
		for(int i = 0; i < m; i++){
			for(int j = i; j < m; j++){
				for(int k = j; k < m; k++){
					for(int h = k; h < m; h++){
						if(i*i + j*j + k*k + h*h > max) break;
						memo[i*i + j*j + k*k + h*h] = memo[i*i + j*j + k*k + h*h] + 1;
					}
				}
			}
		}
	}
	public void calc(int n){
		System.out.println(memo[n]);
	}
	
	

	
	public static void main(String[] args) {
		new Main().run();
	}
}