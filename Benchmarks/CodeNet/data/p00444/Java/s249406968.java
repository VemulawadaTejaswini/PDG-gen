import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		for(;;){
			int n = sc.nextInt();
			
			if(n==0){
				break;
			}
			n = 1000 -n;
			int count = 0;
			int a[]= {500,100,50,10,5,1};
			for(int i =0 ;i < 6;i++){
 			count += n/a[i];
			n = n%a[i];
			}
			System.out.println(count);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}