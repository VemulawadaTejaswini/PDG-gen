
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		for(int i=0;i<n;i++){
			int y = stdIn.nextInt();
			int m = stdIn.nextInt();
			int d = stdIn.nextInt();
			
			int toku = (y-1)/3;
			int kihon = y-1-toku;
			int day = toku*200;
			day += kihon*195;
			
			if(y%3==0){
				day += (m-1)*20;
			}
			else{
				int t_sho = (m-1)/2;
				int t_dai = m-1-t_sho;
				day += t_sho*19;
				day += t_dai*20;
			}
			day += d-1;
			day = 196470-day;
//			day++;
			System.out.println(day);
		}
	}
}