import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		long L  = keyboard.nextLong();
		long R  = keyboard.nextLong();
		long x = 2019;
		
		if(R-L>=2018) {
			System.out.print(0);
		}else{
			for(long i = L; i <=R; i++) {
				for(long j = i+1; j <=R; j++) {
					Long amari = (i*j) % 2019;
					x = (amari<=x)? amari:x ;
				}
			}
			System.out.print(x);
		}
		keyboard.close();	
	}
}
