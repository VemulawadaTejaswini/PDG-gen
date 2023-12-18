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
		int[] dates = new int[100];
		int max = 0;
		for(int i = 0; i < n; i++){
			int m = sc.nextInt();
			for(int j = 0; j < m; j++){
				int date = sc.nextInt();
				dates[date] = dates[date] + 1;
				if(max < dates[date]) max = date;
			}
		}
		if(dates[max] < q) max = 0;
		System.out.println(max);
	}
	public static void main(String[] args){
		new Main().run();
	}
}