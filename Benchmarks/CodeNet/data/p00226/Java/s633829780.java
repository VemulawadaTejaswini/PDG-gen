import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		for(;;){
			String r = sc.next();
			String a = sc.next();
			if(r.equals("0")){
				break;
			}
			
			int blow = 0;
			for(char c : r.toCharArray()){
				if(a.indexOf(c) >= 0){
					blow++;
				}
			}
			int hit = 0;
			for(int i= 0; i <4;i++){
				if(r.charAt(i) == a.charAt(i)){
					hit++;
					blow--;
				}
			}
			
			System.out.println(hit + " "+ blow);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}