import java.util.*;

public class Main {
	
	public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }else if(n < 2 || n % 2 == 0){
            return false;
        }else{
            int x = 3;
            while(x <= Math.sqrt((double)n)){
                if(n%x == 0)    return false;
                x += 2;
            }
            return true;
        }
	}
	
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int count = 0;

        for(int i = 0; i < a; i++){
            if(isPrime(in.nextInt())) count++;
        }

        System.out.println(count);
    }
}
