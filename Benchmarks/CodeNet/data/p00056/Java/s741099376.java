import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(input.hasNext()){
    		int a = input.nextInt();
    		if(a == 0)break;
    		System.out.println(gold(a));
    	}
    }
    
    public static int gold(int a){
    	int count = 0;
    	for(int i = 2 ; i <= a/2 ; i++){
    		if(isPrime(i) && isPrime(a-i))count++;
    	}
    	return count;
    }
    
    public static boolean isPrime(int n){
    	if(n == 2)return true;
    	if(n % 2 == 0)return false;
    	for(int i = 3 ; i <= Math.sqrt(n) ; i++){
    		if(n % i == 0)return false;
    	}
    	return true;
    }
}