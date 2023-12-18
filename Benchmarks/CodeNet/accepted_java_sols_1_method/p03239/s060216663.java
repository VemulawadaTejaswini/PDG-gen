import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = sc.nextInt();
		
		int InTime[];
		InTime= new int[N];
		
		int wark_cost;
		int wark_time;
		int flag = 0;
		int i = 0;
		int count = 0;
		
		for(i = 0; i < N; i++){  // N回くりかえす
			wark_cost = sc.nextInt();
			wark_time = sc.nextInt();
			
			if(wark_time <= T){
				InTime[i] = wark_cost;
				flag = 1;
			}else{
				InTime[i] = 1000;
			}
			
		}
		int min = 1000;
		
		for(i = 0; i < N; i++){
			if(min > InTime[i]){
				min = InTime[i];
			}
			
			
		}
		
		if(flag == 0){
			System.out.println("TLE");
		}
		else{
			System.out.println(min);
		}
	}
}
