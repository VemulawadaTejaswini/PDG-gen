import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		int x = sc.nextInt();
		int debt = 100000;
		for(int i = 0; i < x; i++){
			debt *= 105;
			System.out.println("*"+debt);
			debt += 99999;
			debt /= 100000;
			System.out.println("/"+debt);
			debt *= 1000;
		}
		System.out.println(debt);
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}