import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[]workers;
	static int value, number, n;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		workers = new int[4001];
		int index = 0;
		for(int i = 0; i < n; i++){
			index = sc.nextInt();
			value = sc.nextInt();
			number = sc.nextInt();
			workers[index] += value*number;
		}
		return true;
	}
	static void  solve(){
		int flag = 0;
		for(int index = 1; index < workers.length; index++){
			if(workers[index] >= 1000000){
				System.out.println(index);
				flag++;
			}
		}
		if(flag > 0){
			System.out.println("NA");
		}
	}
}