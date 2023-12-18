import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int q = sc.nextInt();
			if(n == 0 && q == 0){
				break;
			}
			else{
				calc(n,q);
			}
		}
	}
	public void calc(int n, int q){
		int[] dates = new int[101];
		for(int i = 0; i < n; i++){
			int m = sc.nextInt();
			for(int j = 0; j < m; j++){
				int date = sc.nextInt();
				dates[date] = dates[date] + 1;
			}
		}
		
		int maxDate = 0;
		for(int i = 1; i < 101; i++){
			if(dates[maxDate] < dates[i]) maxDate = i;
		}
		if(dates[maxDate] < q) maxDate = 0;
		System.out.println(maxDate);
	}
	public static void main(String[] args){
		new Main().run();
	}
}