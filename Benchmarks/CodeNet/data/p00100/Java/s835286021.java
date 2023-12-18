import java.util.*;
import java.math.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static BigInteger[]workers;
	static int value, number, n;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		workers = new BigInteger[4001];
		int index = 0;
		for(int i = 0; i < workers.length; i++){
			workers[i] = new BigInteger("0");
		}
		for(int i = 0; i < n; i++){
			index = sc.nextInt();
			value = sc.nextInt();
			number = sc.nextInt();
			workers[index] = workers[index].add(BigInteger.valueOf(value*number));
		}
		return true;
	}
	static void  solve(){
		int flag = 0;
		for(int index = 1; index < workers.length; index++){
			if(workers[index].compareTo(BigInteger.valueOf(1000000)) != -1){
				System.out.println(index);
				flag++;
			}
		}
		if(flag > 0){
			System.out.println("NA");
		}
	}
}