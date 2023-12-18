import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run(){
		int[] primes = getPrimesTable();
		while(sc.hasNext()){
			int n = sc.nextInt(), sum = 0;
			for(int i = 0; i < n; i++){
				if(primes[i] == 1)
					sum++;
			}
			System.out.println(sum);
		}
	}
	
	int[] getPrimesTable(){
		int max = 999999;
		int[] primes = new int[max];
		for(int i=0;i<max;i++)
			primes[i] = 1;
		
		primes[0] = 0;
		
		for(int i = 1; i<max ; i++){
			if(primes[i] == 1){
				for(int j = 2; (i+1)*j <= max; j++){
					primes[(i+1)*j-1] = 0;
				}
			}
		}
		
		return primes;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}