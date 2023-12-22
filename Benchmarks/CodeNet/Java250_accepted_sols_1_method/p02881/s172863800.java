import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long x = (long)Math.sqrt(a);
        for(long i = x; i > 0; i--){
            if(a % i == 0){
                System.out.println(i + (a / i) - 2);
                 break;
            }
        }
    }
}