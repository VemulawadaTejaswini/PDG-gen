
import java.util.*;
public class Main {

	private boolean isPrime(int n){
		for(int i=2; i * i <= n; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int count = 0;
			for(int i = 2; i <= n; i++){
				if(isPrime(i)){
					count++;
				}
			}
			System.out.println(count);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}