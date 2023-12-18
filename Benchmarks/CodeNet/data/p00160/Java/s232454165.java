import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int x = 0, y = 0, h = 0, w = 0;
	static int sum;
	public static void main(String[] args) {
		while(read()){

		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		for(int i = 0; i < n; i++){
			x = sc.nextInt();
			y = sc.nextInt();
			h = sc.nextInt();
			w = sc.nextInt();
			solve();
		}
		System.out.println(sum);
		sum = 0;
		return true;
	}
	static void solve(){
		int capacity_cost = 0, weight_cost = 0;
		int capacity = x + y + h, weight = w;
		if(60 >= capacity){
			capacity_cost = 600;
		}else if(80 >= capacity){
			capacity_cost = 800;
		}else if(100 >= capacity){
			capacity_cost = 1000;
		}else if(120 >= capacity){
			capacity_cost = 1200;
		}else if(140 >= capacity){
			capacity_cost = 1400;
		}else if(160 >= capacity){
			capacity_cost = 1600;
		}else{
			capacity_cost = 0;
			weight_cost = 0;
		}

		if(2 >= weight){
			weight_cost = 600;
		}else if(5 >= weight){
			weight_cost = 800;
		}else if(10 >= weight){
			weight_cost = 1000;
		}else if(15 >= weight){
			weight_cost = 1200;
		}else if(20 >= weight){
			weight_cost = 1400;
		}else if(25 >= weight){
			weight_cost = 1600;
		}else{
			capacity_cost = 0;
			weight_cost = 0;
		}

		sum += Math.max(capacity_cost, weight_cost);
	}
}