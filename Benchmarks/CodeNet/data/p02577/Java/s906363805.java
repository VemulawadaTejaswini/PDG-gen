import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
		char[] N = s.next().toCharArray();
		
		long amount = 0;
		for(char v : N) {
			amount += v - '0';
		}
		
		if(amount % 9 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}