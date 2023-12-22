import java.util.*;
class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Main app = new Main();
		while(sc.hasNext()){
		System.out.println(app.length(sc.nextInt(),sc.nextInt()));
		}
	}
	
	
	
	int length(int a,int b){
		int ans = 1;
		a += b;
		while(a  >=  10){
				ans ++;
				a /=10;
		}
		return ans;
	}
	
	
	
	
	
	
}