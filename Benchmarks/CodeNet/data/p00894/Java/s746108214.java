import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			if(n != 0){
				calc(n);
			}
			else{
				break;
			}
		}
	}
	public void calc(int n){
		int[] ans = new int[1000];
		int[] ent = new int[1000];
		String today = "";
		
		for(int i = 0; i < n; i++){
			String day = sc.next();
			if(!day.equals(today)){
				today = day;
				ent = new int[1000];
			}
			String time = sc.next();
			int t = calcTime(time);
			String inout = sc.next();
			int p = sc.nextInt();
			
			if(inout.equals("I")) ent[p] = t;
			else if(p == 0){
				for(int k = 1; k < n; k++){
					if(ent[k] != 0){
						ans[k] += Math.min(t - ent[k], t - ent[0]);
					}
				}
				ent[p] = 0;
			}
			else{
				if(ent[0] != 0){
					ans[p] += Math.min(t - ent[p], t - ent[0]);
				}
				ent[p] = 0;
			}
		}
		
		int max = 0;
		for(int i = 1; i < 1000; i++){
			if(max < ans[i]) max = ans[i];
		}
		
		System.out.println(max);
	}
	
	public int calcTime(String time){
		int hour = Integer.valueOf(time.substring(0,2));
		int minute = Integer.valueOf(time.substring(3));
		
		return hour * 60 + minute;
	}
	public static void main(String[] args){
		new Main().run();
	}
}