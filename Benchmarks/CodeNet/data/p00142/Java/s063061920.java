import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		for(;;){
			int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int map[] = new int[n];
			LinkedList<Integer> used =  new LinkedList<Integer>();
			for(int i = 1; i < n ; i++ ){
				map[i] = i * i % n;
				if(!used.contains(map[i])){
					used.add(map[i]);
				}
			}
			int ans[] = new int[(n+1)/2];
			
			for(int z : used){
				for( int y : used){
					if(z == y){
						continue;
					}
					int x = z- y;
					if( x < 0 ){
						x += n;
					}
					if(x > (n-1)/2){
						x = n-x;
					}
					ans[x] ++;
				}
			}
			for(int i = 1; i < (n+1)/2 ; i++){
				System.out.println(ans[i]);
			}
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}