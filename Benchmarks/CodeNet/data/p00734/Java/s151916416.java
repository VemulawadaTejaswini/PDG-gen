import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int value = sc.nextInt();
			int value2 = sc.nextInt();
			if(value == 0 && value2 == 0){
				break;
			}
			else{
				calc(value, value2);
			}
		}
	}
	public void calc(int n, int m){
		int[] tarou = new int[n];
		int[] hanako = new int[m];
		int Tsum = 0;
		int Hsum = 0;
		for(int i = 0; i < n; i++){
			int j = sc.nextInt();
			tarou[i] = j;
			Tsum = Tsum + j;
		}
		for(int i = 0; i < m; i++){
			int j = sc.nextInt();
			hanako[i] = j;
			Hsum = Hsum + j;
		}
		boolean owari = false;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				int nextTsum = Tsum - tarou[i] + hanako[j];
				int nextHsum = Hsum - hanako[j] + tarou[i];
				if(nextTsum ==nextHsum){
					System.out.println(tarou[i] + " " + hanako[j]);
					owari = true;
					break;
				}
			}
			if(owari) break;
		}
		if(!owari){
			System.out.println(-1);
		}
	}
	public static void main(String[] args){
		new Main().run();
	}
}