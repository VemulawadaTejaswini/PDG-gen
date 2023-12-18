
import java.util.*;
public class Main {

	//f©Ç¤©ð»Ê·éÖ
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
			//næèºÌfð©é
			for(int i = n - 1;; i--){
				if(isPrime(i)){
					System.out.print(i +" ");
					break;
				}
			}
			//næèãÌfðÝé
			for(int i = n + 1;; i++){
				if(isPrime(i)){
					System.out.println(i);
					break;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}