import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for(int i = 0 ; i < n ; i++){
        	BigInteger a = new BigInteger(input.nextLine());
        	BigInteger b = new BigInteger(input.nextLine());
        	if(a.add(b).toString().length() < 80){
        		System.out.println(a.add(b));
        	}else{
        		System.out.println("overflow");
        	}
        }
    }    
}