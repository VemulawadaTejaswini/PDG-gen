import java.util.*;
import java.awt.geom.*;
public class Main {

	//0041 start
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		final int MAX = 1299709;
		boolean [] isprime = new boolean[MAX + 1];
		for(int i = 2; i <= MAX; i++){
			isprime[i] = true;
		}
		for(int i = 2; i * i <= MAX; i++){
			if(isprime[i]){
				for(int j = i * 2; j <= MAX; j+= i){
					isprime[j] = false;
				}
			}
		}
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int pre = n;
			int forward = n;
			while(true){
				if(isprime[pre--]) break;
			}
			pre++;
			while(true){
				if(isprime[forward++])break;
			}
			forward--;
			System.out.println(forward-pre);
		}
		
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}