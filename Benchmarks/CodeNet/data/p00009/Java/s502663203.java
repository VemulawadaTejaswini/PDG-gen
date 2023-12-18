
import java.util.Scanner;
 class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,c = 0, result[] = new int[30];
		while(sc.hasNext()){
			n = sc.nextInt();
			if(n >= 2) result[c]++;
			for(int i = 3; i <= n; i += 2){
				if(i%3 == 0 && i !=3) continue;
				if(isPrime(i) == true){
					result[c]++;
				}
			}
			c++;
		}
		for(int i = 0; i < c; i++){
			System.out.println(result[i]);
		}
	}
	
	public static boolean isPrime(int a){
		int j = 1;
		while(a > j*j){
			j++;
		}
		a = j;
		for(int i = 3; i < a; i+=2){
			if(a%i == 0) return false;
		}
		return true;
	}
 }