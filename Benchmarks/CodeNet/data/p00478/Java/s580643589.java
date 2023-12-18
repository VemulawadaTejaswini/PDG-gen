import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		String str = sc.next();
		int n  = sc.nextInt();
		int ans = 0;
		for(int i =0 ; i < n ;i++){
			String buffer= sc.next();
			buffer = buffer+buffer;
			if(buffer.contains(str)){
				ans++;
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}