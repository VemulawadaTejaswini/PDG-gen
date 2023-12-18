import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		while(true){
			int n = s.nextInt();
			int x = s.nextInt();
			if(n == 0 && x == 0) break;
			int sum = 0;
			int count = 0;
			int a = 0;
			int num[] = new int [n];
			for(int i = 0; i < n; i++) num[i] = i + 1;
			for(int i = a; i < n; i++){
				for(int j = i+1; j < n; j++){
					for(int k = j+1; k < n; k++){
						sum = num[i] + num[j] + num[k];
						if(sum == x){
							count++;
						}
						a++;
					}
				}
			}
			System.out.println(count);
		}
	}
	public static void main(String[] args) {
	
		new Main().run();
		
	}
}