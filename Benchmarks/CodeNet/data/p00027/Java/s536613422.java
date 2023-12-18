import java.util.*;
public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int [] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		String [] date = {"Thursday", "Friday", "Saturday","Sunday", "Monday", "Tuesday","wednesday"};
		int [] monthAcc = new int[13];
		for(int i=1; i < 13; i++){
			monthAcc[i] = monthAcc[i-1] + month[i];
		}
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if((a|b) == 0) break;
			int today = monthAcc[a-1] + b;
			int ans = (today - 1) % 7;
			System.out.println(date[ans]);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}