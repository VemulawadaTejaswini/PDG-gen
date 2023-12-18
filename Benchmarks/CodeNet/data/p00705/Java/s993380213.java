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
		int maxDate = 0;
		int maxNum = 0;
		for(int i = 0; i < n; i++){
			int m = sc.nextInt();
			for(int j = 0; j < m; j++){
				int date = sc.nextInt();
				dates[date] = dates[date] + 1;
				if(maxNum < dates[date]){
					maxDate = date;
					maxNum = dates[date];
				}
			}
		}
		if(maxNum < q) maxDate = 0;
		System.out.println(maxDate);
	}
	public static void main(String[] args){
		new Main().run();
	}
}