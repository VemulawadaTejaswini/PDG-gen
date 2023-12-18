import java.util.*;
public class Main {
	int n;
	int s;
	
	private int func(int addSum, int sum, int used){
		int ans = 0;
		
		if(addSum == n){
			if(sum == s){
				return 1;
				
			}
			else{
				return 0;
			}
		}
		else{
			for(int i = used + 1; i <= 9; i++){
				ans += func(addSum + 1, sum + i , i);
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