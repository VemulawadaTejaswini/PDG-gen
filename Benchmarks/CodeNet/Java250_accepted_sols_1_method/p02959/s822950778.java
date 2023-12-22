import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] cities = new int[num+1];
		int[] savers = new int[num];
		for(int i = 0; i <= num; i++)cities[i] = sc.nextInt();
		for(int i = 0; i < num; i++)savers[i] = sc.nextInt();

		double ans = 0;
		for(int i = 0; i < num; i++){
			if(savers[i] <= cities[i]){
				ans += savers[i];
				savers[i] = 0;
				continue;
			}else{
				ans += cities[i];
				savers[i] -= cities[i];
			}
			
			if(savers[i] <= cities[i+1]){
				ans += savers[i];
				cities[i+1] -= savers[i];
			}else{
				ans += cities[i+1];
				cities[i+1] = 0;
			}
		}


		System.out.printf("%.0f\n", ans);
	}
}
