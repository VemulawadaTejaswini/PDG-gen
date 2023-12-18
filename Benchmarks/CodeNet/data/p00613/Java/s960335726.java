import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		for(;;){
			int k = sc.nextInt();
			if(k ==0){
				break;
			}
			
			long ans = 0;
			
			for(int i  =0 ; i <k * (k-1)/2 ; i++){
				ans+=sc.nextLong();
			}
			ans/=(k-1);
					System.out.println(ans);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}