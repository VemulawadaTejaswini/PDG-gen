
import java.util.*;
public class Main {
	int n;
	int s;
	boolean [] check  = new boolean[10];
	
	private boolean ischeck(int num){
		if(check[num]){
			return false;
		}
		else{
			return true;
		}
	}
	
	private int func(int addSum, int sum, int used){
		int ans = 0;
		
		if(sum > s)
			return 0;
		
		if(addSum == n){
			if(sum == s){
				return 1;
				
			}
			else{
				return 0;
			}
		}
		else{
			for(int i = 0; i <= 9; i++){
				if(ischeck(i)){
					check[i] = true;
					ans += func(addSum + 1, sum + i * (addSum + 1) , i);
					check[i] = false;
				}
					
			}
			return ans;
		}
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			n = sc.nextInt();
			s = sc.nextInt();
			int ans = func(0,0,-1);
			System.out.println(ans);
		}
		
		
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}